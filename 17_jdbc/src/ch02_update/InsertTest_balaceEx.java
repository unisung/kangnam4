package ch02_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//�ڹ����α׷��� dbms���� default �ɼ��� autocommit<- commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ� 
public class InsertTest_balaceEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//commit ����ó�� ����
			con.setAutoCommit(false);
			
			//3.������ü ����
            //
           String sql="";
           while(run) {
        	   System.out.println("���� ���¹�ȣ�� �Է��ϼ���>");
               String accountNo1 = scanner.next();
               System.out.println("��ü�� ����ȣ �Է��ϼ���>");
               String accountNo2 = scanner.next();
               System.out.println("��ü �ݾ��� �Է��ϼ���>");
               int  amount = scanner.nextInt();
             
            //4.������ ���� 
            //4-3.��� ó��
            sql="select sum(acc1), sum(acc2), sum(balance1), sum(balance2)"
               +" from ( "
               +"select  count(*) acc1, 0 acc2, nvl(sum(balance),0) balance1 ,0 balance2 "
               +" from account where accountno=? "
               + " union all "
               + " select 0 acc1, count(*) acc2, 0 balance1, nvl(sum(balance),0) balance2 "
               + " from account where accountno=? "
               + " )";
            PreparedStatement pstmt = con.prepareStatement(sql);
            //���¹�ȣ ����
            pstmt.setString(1, accountNo1); 
            pstmt.setString(2, accountNo2);
            
            ResultSet rs = pstmt.executeQuery();
          
            if(rs.next()) {
            	if(rs.getInt(1)==0 | rs.getInt(2)==0) {
            		System.out.println("���¹�ȣ�� Ȯ���ϼ���");
            	}else {
            		sql="update account set balance =balance - ? where accountno=? ";
            		pstmt = con.prepareStatement(sql);
            		pstmt.setInt(1, amount);
            		pstmt.setString(2, accountNo1);
            		int result =pstmt.executeUpdate();
            		if(result>0) {
	            		sql="update account set balance = balance + ? where accountno=? ";
	            		pstmt = con.prepareStatement(sql);
	            		pstmt.setInt(1, amount);
	            		pstmt.setString(2, accountNo2);
	            		pstmt.executeUpdate();
            		}
            		//�ΰ� �� �����۾� �̻������ db�� �ݿ�ó��
            		con.commit();
            		System.out.println("��ü�� �Ϸ� �Ǿ����ϴ�.");
            	}
            }else {
            	System.out.println("����");
            }
           //
            System.out.println("����ұ��?(y/n)>");
            String isRun = scanner.next();
            try {
            if(isRun.equalsIgnoreCase("n")) run=false;
            if(!(isRun.equalsIgnoreCase("n") | isRun.equalsIgnoreCase("y")) ) {
            	throw new Exception("y�� n�� �Է��ϼ���");
            }
            }catch(Exception e) {
            	//���� �߻��� �Ѵ� �������·� �ǵ�����
            	con.rollback();
            	System.out.println(e.getMessage());
            }
           }//while�� ��.
		}catch(Exception e) {e.printStackTrace();}
		System.out.println("���α׷� ����");
	}//main�޼ҵ� ��.
}//Ŭ���� ��.

