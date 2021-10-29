import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest16_subQuery01 {
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
		 // (1) �������� ������ ������ ���ǻ�� ���� ���ǻ翡�� ������ ������ ���� �̸�
		 //select name
		 // from customer, orders, book
		 // where customer.custid = orders.custid
		 //    and orders.bookid = book.bookid
		 //    and publisher in (
		 //                             select publisher
		 //                               from customer, orders, book 
		 //                              where customer.custid = orders.custid
		 //                                and orders.bookid = book.bookid
		 //                                and name like '������'  
		 //    )
		 //    and name not  like '������'
		 //  ;  
		 
		 System.out.println("������ ������ �Է��ϼ���>");
	     String custName = scanner.next();
		  
		String sql ="select name "
				+ "  from customer, orders, book "
				+ " where customer.custid = orders.custid "
				+ "   and orders.bookid = book.bookid "
				+ "   and publisher in ( select publisher "
				+ "                       from customer, orders, book"
				+ "                      where customer.custid = orders.custid "
				+ "                        and orders.bookid = book.bookid"
				+ "                        and name like '"+custName+"'"
				+ "   )"
				+ " and name not  like '"+custName+"'";
		
		 System.out.println("������:"+sql);

		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 while(rs.next()) {
			 System.out.println("����:"+rs.getString(1));
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}
