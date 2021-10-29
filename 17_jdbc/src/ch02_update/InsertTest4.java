package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1.드라이버로딩,2.연결객체 생성
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.쿼리객체 생성
            Statement stmt = con.createStatement();
            // 박지성, "서울시", "010-333-4567"
             System.out.println("등록할 고객명을 입력하세요>");
             String name = scanner.nextLine();
             System.out.println("등록할 주소명을 입력하세요>");
             String  address = scanner.nextLine();
             System.out.println("등록할 전화번호를 입력하세요>");
             String  phone = scanner.nextLine();
             
            //4.쿼리문 생성
            String sql ="insert into customer(custid, name, address, phone) "
            		   +" values((select max(custid) + 1 from customer),'"
            		   +name+"','"+address+"','"+phone+"')";//쿼리문 작성
            System.out.println("sql:"+sql);
            //5-1.쿼리전송 및 결과받기 
            //executeUpdate(쿼리문) 리턴타입은 int 삽입된 행의 수 리턴, 0이면 입력안된 결과
             stmt.executeUpdate(sql);
             
            //5-2.결과 조회 
            sql ="select * from cutomer order by custid";
            //조회 
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
            System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
            }
     			//6.자원해제
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
