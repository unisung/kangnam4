package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest4 {
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
            String sql ="insert into customer(custid, name, address, phone) "
            		   +" values((select max(custid) + 1 from customer),'"
            		   +name+"','"+address+"','"+phone+"')";//������ �ۼ�
            System.out.println("sql:"+sql);
            //5-1.�������� �� ����ޱ� 
            //executeUpdate(������) ����Ÿ���� int ���Ե� ���� �� ����, 0�̸� �Է¾ȵ� ���
             stmt.executeUpdate(sql);
             
            //5-2.��� ��ȸ 
            sql ="select * from cutomer order by custid";
            //��ȸ 
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
            System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
            }
     			//6.�ڿ�����
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
