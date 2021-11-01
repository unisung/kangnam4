package ch11_blob;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobInputEx {
public static void main(String[] args) {
	try {
	//1.����̹��ε�
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	 //2.���ᰴü ����
	 String url="jdbc:oracle:thin:@localhost:1521:xe";
	 String userid="madang";
	 String pwd="madang";
	 Connection con = DriverManager.getConnection(url,userid,pwd);
	 
	 //3.File�Է� ��Ʈ�� ����
	 File file = new File("c:/temp/myImage.png");
	 int len = (int)file.length();//���ϻ����� 
	 InputStream is = new FileInputStream(file);//inputStream
	 
	 //4.sql��
	 String sql = "insert into photo values (?,?)";
     PreparedStatement pstmt =con.prepareStatement(sql);
     pstmt.setString(1, "myImage1");
     pstmt.setBinaryStream(2, is, len);//setBinaryStream(index,input��Ʈ��,���ϱ���);
     
     //5. �Է� ����
     int result = pstmt.executeUpdate();
     if(result>0) System.out.println("�Է� ����");
    
     //6.�ڿ�����
     pstmt.close(); con.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
