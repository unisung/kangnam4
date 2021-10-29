import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest15 {
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
		 // group by having ����
		 //--[���� 3-20] ������ 8,000�� �̻��� ������ ������ ������ ���Ͽ� ������ �ֹ� 
		 //--������ �� ������ ���Ͻÿ�. (��, �� �� �̻� ������ ������ ���Ͻÿ�.)
		 // select custid, count(*) as ��������
		 //from orders
		 //where saleprice >=8000 -- ���� ���� ����
		 //group by custid -- group���
		 //having count(*)>=2 -- �������� ���͸� ����
		 //order by custid  -- ���� 
		 //;
		 
		 System.out.println("���� ���� ����>");
		 int minPrice = scanner.nextInt();
		 System.out.println("��ȸ�� ���ű��� �Ǽ� >");
		 int count = scanner.nextInt();
		  
		String sql ="select custid, count(*)"
				+ " from orders "
				+ " where saleprice >= "+minPrice // -- ���� ���� ����
				+ " group by custid " //group���
				+ " having count(*)>= "+count //�������� ���͸� ���� 
				+ " order by custid " ; //����
		
		 System.out.println("������:"+sql);

		 //5.������ ���� �� ��� �ޱ�
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.����۾�
		 //�Ѱ� �� ��� �ѹ��� rs.next() ȣ��
		 while(rs.next()) {
			 int custid = rs.getInt(1);
			 int total= rs.getInt(2);
			 System.out.println(custid+"\t|"+total);
		 }
		 //7.�ڿ�����
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}