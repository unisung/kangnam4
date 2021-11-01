package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx {
	public static void main(String[] args) throws Exception {
		//1.드라이버로딩
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.연결객체 생성
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.callable객체 생성
		 String sql="{call AveragePrice(?)}";
		 CallableStatement cstmt = con.prepareCall(sql);
		 //registerOutputParameter()
		 cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		 
		 //4.실행
		 cstmt.executeUpdate();
		 System.out.println("평균:"+cstmt.getInt(1));
		 
        //5.자원해제
		 cstmt.close(); con.close();
	}
}
