import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest3 {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
							 "madang", "madang");
			if(con!=null) {
				System.out.println("���Ἲ��");
			}else {
				System.out.println("�������");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
