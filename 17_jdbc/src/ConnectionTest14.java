import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String driver ="oracle.jdbc.driver.OracleDriver";
		final String url ="jdbc:oracle:thin:@localhost:1521:xe";
		final String userid="madang";
		final String pwd ="madang";
	 try {
		 //1.����̹� �ε�
		 Class.forName(driver);
		 //2.���ᰴü ����
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.������ü ����
		 Statement stmt = con.createStatement();
		 //4.������ �ۼ�
		 //[���� 3-17] �ֹ����̺��� Ư�� ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���Ͻÿ�.
         //select sum(saleprice) as total,
         //avg(saleprice) as average,
         //min(saleprice) as minimum,
         //max(saleprice) as maximum
		 //from orders 
		 //where custid = 2;
		 
		 System.out.println("��ȸ�� ����ȣ�� �Է��ϼ���>");
		 int custid = scanner.nextInt();
		  
		String sql ="select sum(saleprice) as total, "
				   +" avg(saleprice) as average, "
				   +" min(saleprice) as minimum, "
				   +" max(saleprice) as maximum  "
				   +" from orders "
				   +" where custid = "+custid;//<--���ӹ� �ۼ�
		
		 System.out.println("������:"+sql);

		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 while(rs.next()) {
			 int total = rs.getInt(1);
			 int average= rs.getInt(1);
			 int minimum = rs.getInt(1);
			 int maximum = rs.getInt(1);
			 System.out.println(total+"\t|"+average+"\t|"+minimum+"\t|"+maximum);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}
