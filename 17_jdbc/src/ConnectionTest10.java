import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest10 {
	public static void main(String[] args) {
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
		 //도서이름의 왼쪽 두 번째 위치에 ‘구’라는 문자열을 갖는 도서를 검색하시오.
         //select *  from book where bookname like '_구%';
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("제목을 입력하세요>");
		 String title = scanner.next();
		 String sql ="select *  from book where bookname like '_"+title+"%'";//<--쿼ㅣ문 작성
		 
		 System.out.println("쿼리문:"+sql);

		 //5.쿼리문 전송 및 결과 받기
		 ResultSet rs = stmt.executeQuery(sql);
		 //6.출력작업
		 System.out.println("bookid| bookname| publisher|price");
		 System.out.println("---------------------------------");
		 //한건 인 경우 한번만 rs.next() 호출
		 while(rs.next()) {
			 int bookid = rs.getInt(1);
			 String bookname = rs.getString(2);
			 String publisher = rs.getString(3);
			 int price =rs.getInt(4);
			 System.out.println(bookid+"\t|"+bookname+"\t|"+publisher+"\t|"+price);
		 }
		 //7.자원해제
		 rs.close();    stmt.close();   con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }

	}
}
