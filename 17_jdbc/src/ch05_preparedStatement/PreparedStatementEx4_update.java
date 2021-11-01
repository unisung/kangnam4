package ch05_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx4_update {
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
		 String sql ="update book set bookname=?, publisher=? where bookid=?";
		 PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
		 //sql�� ���޽� 10�� ���ε��Ǿ ������ ���������� ���޵�
		 pstmt.setString(1, "�౸�� ������?");
		 pstmt.setString(2, "korea���ǻ�");
		 pstmt.setInt(3, 30);
		 
		 //4.����
		 int resultCount = pstmt.executeUpdate();
		 if(resultCount>0) System.out.println("��������");
		 else System.out.println("��������");
		 
  }catch(Exception e) {
	  e.printStackTrace();
  }
}
}
