package ch02_update;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü ����
            Statement stmt = con.createStatement();
            //
             System.out.println("����� �������� �Է��ϼ���>");
             String title = scanner.next();
             System.out.println("����� ���ǻ���� �Է��ϼ���>");
             String  publisher = scanner.next();
             System.out.println("����� ������ �Է��ϼ���>");
             int  price = scanner.nextInt();
             
            //4.������ ����
            String sql ="insert into book(bookid, bookname,publisher, price) "
            		  + " values((select max(bookid)+1 from book),'"+title+"','"+publisher+"',"+price+")";
            
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
