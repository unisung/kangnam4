package ch11_blob;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlobOutEx {
	public static void main(String[] args) {
		try {
			//1.����̹��ε�
		    Class.forName("oracle.jdbc.driver.OracleDriver");
				 
			//2.���ᰴü ����
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			Connection con = DriverManager.getConnection(url,userid,pwd);
			
			
			File file = new File("c:/temp/outPutImage.png");
			FileOutputStream fos = null;
			
			
			//3.sql�� ���۰�ü ���� - template���İ�ü 
			String sql ="select image from photo where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);//������ sql���� �Ű������� �޾Ƽ� ����
			pstmt.setString(1, "myImage1");
				 
		    //4.����
			ResultSet rs = pstmt.executeQuery();//����ô� sql��
			if(rs.next()) {
				Blob blob = rs.getBlob(1);
				InputStream is = blob.getBinaryStream();//���̳ʸ�����Ÿ �Է� ��Ʈ�� ����
				byte[] bt = new byte[8*1024];//buffer
				int len=0;
				fos = new FileOutputStream(file);//�����Ұ�� ���ϸ����� �ƿ� ��Ʈ�� ����
				
				while((len=is.read(bt))!=-1) {
					 fos.write(bt,0,len);
				}
				
				is.close(); fos.close();
				System.out.println("��ȸ ����");
			}else {
				System.out.println("����Ÿ ����");
			}
			rs.close();
			pstmt.close();
			con.close();
		  }catch(Exception e) {
	         e.printStackTrace();		  
		  }
	}
}
