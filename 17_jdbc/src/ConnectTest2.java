import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ����Ŭ ���� �׽�Ʈ
 * */
public class ConnectTest2 {
	public static void main(String[] args) {
       String url ="jdbc:oracle:thin:@localhost:1521:xe";
       String userid="madang";
       String pwd ="madang";
     
       //����̹� �ε�
       try {
    	    //oracle DB���� ����̹� �ε�
    	    Class.forName("oracle.jdbc.driver.OracleDriver");//
    	    System.out.println("����̹� �ε� ����");
       }catch(Exception e) {
    	    e.printStackTrace();
       }
       
       //DBMS�� ����
       try {
    	       System.out.println("�����ͺ��̽� ���� �غ�......");
    	       Connection con =DriverManager.getConnection(url, userid, pwd);
    	       if(con!=null) {
    	    	   System.out.println("�����ͺ��̽� ���� ����...");
    	       }
    	  //������ü ����
    	   Statement stmt = null;
    	   ResultSet rs=null;
    	   //db���������� ������ü ����
    	   stmt = con.createStatement();
    	   //������ ������
    	   String sql ="select bookid, bookname, publisher, price from book order by bookid";
    	   //DBMS�� ������ ���� �� ��� �ޱ�
    	   rs = stmt.executeQuery(sql);
    	   //����� �Ѿ�� ResultSet�� �� �྿ �����Ͽ� ó���ϱ�
    	   while(rs.next()) {
    		    int bookid =rs.getInt("bookid");
    		    String bookname=rs.getString("bookname");
    		    String publisher=rs.getString("publisher");
    		    int price =rs.getInt("price");
    		    System.out.println(bookid+"|"+bookname+"|"+publisher+"|"+price); 
    	   }
    	   //�ڿ�����
    	   con.close();
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}
