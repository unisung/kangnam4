package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//�ڹ����α׷��� dbms���� default �ɼ��� autocommit<- commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ� 
public class InsertTest6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü ����
            Statement stmt = con.createStatement();
            //
             System.out.println("����� ������ �Է��ϼ���>");
             String name = scanner.nextLine();
             System.out.println("���� �Աݾ��� �Է��ϼ���>");
             int  balance = scanner.nextInt();
             
            //4.������ ���� 
            //4-3.��� ó��
            String sql="insert into customer ";//�ۼ�
            		//��� ����
            		stmt.executeUpdate(sql);
            
            //5.��� ��ȸ 
            sql ="select * from account order by accountNo";
            //��ȸ 
           ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
            System.out.println();//�ۼ�
            }
            //���
            //-- �̸�, �ܰ� 10000 �Է�
            //--��ϰ�� ��ȸ
            //-- 111-001, 'ȫ�浿', 10000
            //-- 111-002, '������', 10000
            //-- 111-003, '�Ӳ���', 10000
     			//6.�ڿ�����
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}