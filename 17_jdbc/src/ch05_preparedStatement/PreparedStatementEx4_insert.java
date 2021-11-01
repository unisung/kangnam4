package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx4_insert {
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
		 String sql ="insert into book values(?,?,?,?)";
		 PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
		 //sql�� ���޽� 10�� ���ε��Ǿ ������ ���������� ���޵�
		 pstmt.setInt(1, 30);
		 pstmt.setString(2, "�౸�� ����?");
		 pstmt.setString(3, "�ѱ����ǻ�");
		 pstmt.setInt(4, 25000);
		 
		 //4.����
		 int resultCount = pstmt.executeUpdate();
		 if(resultCount>0) System.out.println("�Է¼���");
		 else System.out.println("�Է½���");
		 
  }catch(Exception e) {
	  
  }
}
}
