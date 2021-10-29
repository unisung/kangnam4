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
		 //1.드라이버 로딩
		 Class.forName(driver);
		 //2.연결객체 생성
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 //3.쿼리객체 생성
		 Statement stmt = con.createStatement();
		 //4.쿼리문 작성
		 //[질의 3-17] 주문테이블의 특정 고객이 주문한 도서의 총 판매액, 평균값, 최저가, 최고가를 구하시오.
         //select sum(saleprice) as total,
         //avg(saleprice) as average,
         //min(saleprice) as minimum,
         //max(saleprice) as maximum
		 //from orders 
		 //where custid = 2;
		 
		 System.out.println("조회할 고객번호를 입력하세요>");
		 int custid = scanner.nextInt();
		  
		String sql ="select sum(saleprice) as total, "
				   +" avg(saleprice) as average, "
				   +" min(saleprice) as minimum, "
				   +" max(saleprice) as maximum  "
				   +" from orders "
				   +" where custid = "+custid;//<--쿼ㅣ문 작성
		
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 int total = rs.getInt(1);
			 int average= rs.getInt(1);
			 int minimum = rs.getInt(1);
			 int maximum = rs.getInt(1);
			 System.out.println(total+"\t|"+average+"\t|"+minimum+"\t|"+maximum);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}
}
