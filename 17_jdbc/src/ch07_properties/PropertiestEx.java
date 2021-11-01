package ch07_properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class PropertiestEx {
public static void main(String[] args) {
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
		 Connection con = DriverManager.getConnection(url, user, pwd);
		 
		//3.sql�� ���۰�ü ����
			Statement stmt = con.createStatement();
		//4.���� ���� �� ��� ó��
			String sql="select * from customer order by custid"; 
			System.out.println("sql:"+sql);
			 ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			  System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			}	  
	    //5.�ڿ�����-������ ��ü �� �������� ����
				  rs.close(); stmt.close(); con.close();
	}catch(Exception e) {
		
	}
}
}
