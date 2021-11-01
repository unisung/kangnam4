package ch08_batch;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class BatchEx {
public static void main(String[] args) {
	Connection con=null;
	try {
		//�Է�(transaction)ó��
				//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
				 FileInputStream fis = new FileInputStream("c:\\driver\\jdbc.properties");
				 Properties pro = new Properties();
				 //properties�� �о� ���̱�
				 pro.load(fis);
				 //properties�� ���� �ش�Ű�� ���� ���� getProperty(Ű)
				 String driver = pro.getProperty("driver");
				 String url = pro.getProperty("url");
				 String user = pro.getProperty("user");
				 String pwd = pro.getProperty("password");
				 
				 Class.forName(driver);
				 con = DriverManager.getConnection(url, user, pwd);
				 con.setAutoCommit(false);
				 
				//3.sql�� ���۰�ü ����
				 String sql ="insert into table_test values (?,?,?) ";
				 
				 PreparedStatement pstmt = con.prepareStatement(sql);
				 
				 for(int i=1;i<1000;i++) {
					 int bookid = 134+i;//
					 String bookName = "book"+i;
					 int price =5000+(((int)Math.random()*1000)+1);
					 
					 pstmt.setInt(1, bookid);
					 pstmt.setString(2, bookName);
					 pstmt.setInt(3, price);
					 
					 //batch job
					 pstmt.addBatch();
					 
					 //
					 pstmt.clearParameters();
					 
					if(i%100==0) {
						//100�� �������� batch�� ����
						pstmt.executeBatch();
						//batch�� �ʱ�ȭ
						pstmt.clearBatch();
						//db�ݿ�ó��
						con.commit();
					}
					
					//�ܿ� ó��
					pstmt.executeBatch();
					con.commit();
				 }
	}catch(Exception e) {
		try {
		con.rollback();
		}catch(Exception e1) {}
		e.printStackTrace();
	}
}
}
/**
 * 
-- ���̺� ����
drop table table_test;
-- ���̺� ����
create table table_test(
bookid number primary key,
bookname varchar2(50),
price number
);
--�Է� ������
insert into table_test values ((select nvl(max(bookid), 0)+1 from table_test),'book'||(select 'book'||(nvl(max(bookid), 0)+1) from table_test), 5000); 
--�Է� ����Ÿ ��ȸ
select * from table_test; 
    
 * */
