package ch02_update;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü ����
            Statement stmt = con.createStatement();
            // ������, "�����", "010-333-4567"
             System.out.println("����� ������ �Է��ϼ���>");
             String name = scanner.nextLine();
             System.out.println("����� �ּҸ��� �Է��ϼ���>");
             String  address = scanner.nextLine();
             System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���>");
             String  phone = scanner.nextLine();
             
            //4.������ ����
            String sql ="";//������ �ۼ�
            System.out.println("sql:"+sql);
            //5.�������� �� ����ޱ� 
            //executeUpdate(������) ����Ÿ���� int ���Ե� ���� �� ����, 0�̸� �Է¾ȵ� ���
             int result =stmt.executeUpdate(sql);            
			if(result>0) {
				System.out.println("�Է¼���");
			}else {
				System.out.println("�Է½���");
			}
			//6.�ڿ�����
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
