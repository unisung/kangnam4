package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// db�ݿ�ó�� ����ó�� -Autocommit -false
public class DeleteTest01 {
	public static void main(String[] args) {
		 Connection con=null;
	try {
	 //1.����̹��ε�
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	 //2.���ᰴü ����
	 String url="jdbc:oracle:thin:@localhost:1521:xe";
	 String userid="madang";
	 String pwd="madang";
	 con = DriverManager.getConnection(url,userid,pwd);
      
	 //3-1.sql�� ���۰�ü ����
	 Statement stmt = con.createStatement();
	 //3-2.db�ݿ� ���� ó��
	 con.setAutoCommit(false);//default�� true, -> false�� ó�� �ϸ� ���� commitó�� ��.
	 
	 //4.sql�� ����
	 String sql = "delete from customer where custid =(select max(custid) from customer)";
	 
	 //5.db�ݿ�ó��
	 int resultCount = stmt.executeUpdate(sql);
	 System.out.println("resultCount:"+resultCount);
	 if(resultCount>0) System.out.println("�����Ϸ�");
	 else System.out.println("���� ����");
	 
	 //5-2. �޸𸮿��� �۾��� ���� ������ db�� �ݿ�ó��
	 con.commit();//db�ݿ�
	 //6.�ڿ�����
	 stmt.close();   con.close();
	}catch(Exception e) {
		try {
			con.rollback();//�޸𸮿��� ó���� ���� �߻��ϸ� db�� �ݿ����� �ʰ� ���� ���·� �ǵ����� ó��
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}finally {
		try {
			con.setAutoCommit(true);//java�� default������ autocommit true�� ���� ����ó��
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
}
