package ch02_update;

import java.sql.Connection;
import java.sql.Statement;

public class InsertTest01 {
	public static void main(String[] args) {
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü ����
            Statement stmt = con.createStatement();

            //4.������ ����
            String sql ="insert into book(bookid, bookname,publisher, price) "
            		  + " values((select max(bookid)+1 from book),'�౸����','�������ǻ�',30000)";
            
            //5.�������� �� ����ޱ� 
            //executeUpdate(������) ����Ÿ���� int ���Ե� ���� �� ����, 0�̸� �Է¾ȵ� ���
             int result =stmt.executeUpdate(sql);            
			if(result>0) {
				System.out.println("�Է¼���");
			}else {
				System.out.println("�Է½���");
			}
			//6.�ڿ�����
			stmt.close();  con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
