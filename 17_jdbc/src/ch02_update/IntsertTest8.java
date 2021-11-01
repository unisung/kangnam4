package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class IntsertTest8 {
	public static void main(String[] args) throws Exception{
		//�Է�(transaction)ó��
		//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
		  Connection con = DaoConnector.getInstance().getConnection();
		//3.sql�� ���۰�ü ����
		  Statement stmt = con.createStatement();
		//4.���� ���� �� ��� ó��
		  String sql="select * from customer where custid=(select max(custid) from customer)"; 
		  System.out.println("sql:"+sql);
		  ResultSet rs = stmt.executeQuery(sql);
		  while(rs.next()) {
			  System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
		  }
		  
		//5.�ڿ�����-������ ��ü �� �������� ����
		  rs.close(); stmt.close(); con.close();
	}
}
