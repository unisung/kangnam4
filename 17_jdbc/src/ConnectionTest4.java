import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest4 {
	public static void main(String[] args) {
		
		try {
			//1.�������̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�ε��� ����̹��κ��� ���ᰴü ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
							 "madang", "madang");
			if(con!=null) {
				System.out.println("���Ἲ��");
			}else {
				System.out.println("�������");
			}
			//3. ������ ���ް�ü ����
			Statement stmt = con.createStatement();
			//4. ������ �ۼ�
			StringBuffer sb = new StringBuffer();
			sb.append("select bookname, bookid, price, publisher from book order by bookid");
			
			//5. ��ȸ ��ü ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sb+"");
			while(rs.next()) {
				String bookname = rs.getString(1);//getString(Į������)
				int bookid = rs.getInt("bookid");//getInt(Į������), ������ Į������ ȥ�ջ�� ����
				int price = rs.getInt(3);
				String publisher = rs.getString(4);
				System.out.println(bookid+"\t|"+bookname+"\t|"+publisher+"\t|"+price);
			}
			//6.�ڿ� ���� 
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}