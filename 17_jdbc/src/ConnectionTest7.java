import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest7 {
	public static void main(String[] args) {
	 try {
		 //1.����̹� �ε�
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 //2.���ᰴü ����
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				                                          "madang", "madang");
		 //3.������ü ����
		 Statement stmt = con.createStatement();
		 //4.������ �ۼ�
		 //��ȸ ������ ���ڿ��� ���� ���ڿ� ǥ�� ''�� ��� where ���� ������ ���
		 int bookid =1;
		 String bookname="�౸�� ����";
		 String sql ="select bookid, bookname, publisher, price from book where bookid=" 
		            + bookid+" and bookname like '"+bookname+"'";
		 System.out.println("������:"+sql);

		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 System.out.println("bookid| bookname| publisher|price");
		 System.out.println("---------------------------------");
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 if(rs.next()) {
			 bookid = rs.getInt(1);
			 bookname = rs.getString(2);
			 String publisher = rs.getString(3);
			 int price =rs.getInt(4);
			 System.out.println(bookid+"\t|"+bookname+"\t|"+publisher+"\t|"+price);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
