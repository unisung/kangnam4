import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest3 {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
							 "madang", "madang");
			if(con!=null) {
				System.out.println("연결성공");
			}else {
				System.out.println("연결실패");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
