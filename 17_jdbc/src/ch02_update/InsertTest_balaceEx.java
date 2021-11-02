package ch02_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//자바프로그램은 dbms저장 default 옵션이 autocommit<- commit 명령 실행하지 않아도 db에 자동 반영 
public class InsertTest_balaceEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		//1.드라이버로딩,2.연결객체 생성
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.쿼리객체 생성
            //
           String sql="";
           while(run) {
        	   System.out.println("본인 계좌번호를 입력하세요>");
               String accountNo1 = scanner.next();
               System.out.println("이체할 고객번호 입력하세요>");
               String accountNo2 = scanner.next();
               System.out.println("이체 금액을 입력하세요>");
               int  balance = scanner.nextInt();
             
            //4.쿼리문 생성 
            //4-3.등록 처리
            sql="select sum(acc1), sum(acc2), sum(balance1), sum(balance2)"
               +" from ( "
               +"select  count(*) acc1, 0 acc2, nvl(sum(balance),0) balance1 ,0 balance2 "
               +" from account where accountno=? "
               + " union all "
               + " select 0 acc1, count(*) acc2, 0 balance1, nvl(sum(balance),0) balance2 "
               + " from account where accountno=? "
               + " )";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            con.setAutoCommit(false);
            
            pstmt.setString(1, accountNo1); 
            pstmt.setString(2, accountNo2);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
            	if(rs.getInt(1)==0 | rs.getInt(2)==0) {
            		System.out.println("계좌번호를 확인하세요");
            		break;
            	}else {
            		int fromAmount =rs.getInt(3);
            		int toAmount = rs.getInt(4);
            		sql="update account set balance -= ? where accountno=? ";
            		pstmt = con.prepareStatement(sql);
            		int result =pstmt.executeUpdate();
            		if(result>0) {
	            		sql="update account set balance += ? where accountno=? ";
	            		pstmt = con.prepareStatement(sql);
	            		pstmt.executeUpdate();
            		}
            		con.commit();
            	}
            }		
           //
            System.out.println("계속할까요?(y/n)>");
            String isRun = scanner.next();
            try {
            if(isRun.equalsIgnoreCase("n")) run=false;
            if(!(isRun.equalsIgnoreCase("n") | isRun.equalsIgnoreCase("y")) ) {
            	throw new Exception("y나 n을 입력하세요");
            }
            }catch(Exception e) {
            	con.rollback();
            	System.out.println(e.getMessage());
            }
           }		
		}catch(Exception e) {}  
	}//main메소드 끝.
}//클래스 끝.

