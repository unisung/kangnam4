package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx {
 public static void main(String[] args) {
  try {
	//1.����̹��ε�
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.���ᰴü ����
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.sql�� ���۰�ü ���� - template���İ�ü 
		 String sql ="select * from customer where custid=?";
		 PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
		 //sql�� ���޽� 10�� ���ε��Ǿ ������ ���������� ���޵�
		 pstmt.setInt(1, 10);
		 
		 //4.����
		 ResultSet rs = pstmt.executeQuery();//����ô� sql�� �� �Ű������� ������Ȥ ����
		 rs.next();
		 System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
		 
		 
  }catch(Exception e) {
	  
  }
}
}