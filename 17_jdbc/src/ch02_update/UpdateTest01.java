package ch02_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest01 {
	public static void main(String[] args) throws Exception{
		//1.����̹� �ε�,
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.���ᰴü ����
	    String url="jdbc:oracle:thin:@localhost:1521:xe";
	    String userid="madang";
	    String pwd="madang";
	    Connection con = DriverManager.getConnection(url,userid,pwd);
		//3.sql�� ���۰�ü ����
	    Statement stmt = con.createStatement();
		//4.sql�� �ۼ� �� ���� �� ��� �ޱ�
	    //4-1. ������ ����
	    String address="�����";
	    String phone="010-111-1234";
	    int custid=10;
	    String sql ="update customer set address='"
	               + address+"', phone='"+phone+"' where custid="+custid;
	    System.out.println("sql:"+sql);
	    //4-2. ������ ���� �� ��� �ޱ�
	    int resultCount = stmt.executeUpdate(sql);
		//5.��� ó��
	    if(resultCount>0) {
	    	System.out.println("�����Ϸ�");
	    }else {
	    	System.out.println("��������");
	    }
	    
		//6.�ڿ�����
	    stmt.close(); con.close();
	}
}