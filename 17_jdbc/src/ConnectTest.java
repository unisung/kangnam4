import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ����Ŭ ���� �׽�Ʈ
 * */
public class ConnectTest {
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
       }catch(Exception e) {
    	   e.printStackTrace();
       }
	}
}
