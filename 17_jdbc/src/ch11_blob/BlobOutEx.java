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
			//1.드라이버로딩
		    Class.forName("oracle.jdbc.driver.OracleDriver");
				 
			//2.연결객체 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userid="madang";
			String pwd="madang";
			Connection con = DriverManager.getConnection(url,userid,pwd);
			
			
			File file = new File("c:/temp/outPutImage.png");
			FileOutputStream fos = null;
			
			
			//3.sql문 전송객체 생성 - template형식객체 
			String sql ="select image from photo where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);//생성시 sql문을 매개변수로 받아서 생성
			pstmt.setString(1, "myImage1");
				 
		    //4.실행
			ResultSet rs = pstmt.executeQuery();//실행시는 sql문
			if(rs.next()) {
				Blob blob = rs.getBlob(1);
				InputStream is = blob.getBinaryStream();//바이너리데이타 입력 스트림 생성
				byte[] bt = new byte[8*1024];//buffer
				int len=0;
				fos = new FileOutputStream(file);//저장할경로 파일명으로 아웃 스트림 생성
				
				while((len=is.read(bt))!=-1) {
					 fos.write(bt,0,len);
				}
				
				is.close(); fos.close();
				System.out.println("조회 성공");
			}else {
				System.out.println("데이타 없음");
			}
			rs.close();
			pstmt.close();
			con.close();
		  }catch(Exception e) {
	         e.printStackTrace();		  
		  }
	}
}
