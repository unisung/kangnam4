package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//�ڹ����α׷��� dbms���� default �ɼ��� autocommit<- commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ� 
public class InsertTest5 {
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
            //4-1. �ش� �̸����� ȸ���� �ִ��� Ȯ�� 
            String sql ="select count(*) from customer where name ='"+name+"'";
            System.out.println("sql:"+sql);
            //4-2.�������� �� ����ޱ� 
            ResultSet rs =stmt.executeQuery(sql);
            if(rs.next()) {//��������� �Ѿ������ ó��
            	if(rs.getInt(1)>0) {//�Ѿ�� ����� ��
            		System.out.println("�̹� ��ϵ� ȸ�����Դϴ�.");
            	}else {
            	  	//4-3.��� ó��
            		sql="insert into customer "
            		   +" values((select max(custid)+1 from customer),'"+name+"','"+address+"','"+phone+"')";
            		//��� ����
            		stmt.executeUpdate(sql);
            	}
            }
            
            //5.��� ��ȸ 
            sql ="select * from customer order by custid";
            //��ȸ 
            rs = stmt.executeQuery(sql);
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