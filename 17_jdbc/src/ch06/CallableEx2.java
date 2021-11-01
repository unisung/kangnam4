package ch06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableEx2 {
	public static void main(String[] args) throws Exception {
		//1.����̹��ε�
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //2.���ᰴü ����
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String userid="madang";
		 String pwd="madang";
		 Connection con = DriverManager.getConnection(url,userid,pwd);
		 
		 //3.callable��ü ����
		 String sql="{call bookInsertORUpdate(?,?,?,?)}";//In ��� �Ű����� 4�� ���
		 CallableStatement cstmt = con.prepareCall(sql);
		 //�Է��Ķ���� ����
		 cstmt.setInt(1, 31);
		 cstmt.setString(2, "�߱��� ����?");
		 cstmt.setString(3,"�߱��������ǻ�");
		 cstmt.setInt(4, 30000);
		 
		 //4.����
		 cstmt.executeUpdate();
		 
        //5.�ڿ�����
		 cstmt.close(); con.close();
	}
}

/*

create or replace NONEDITIONABLE procedure bookInsertORUpdate(
 mybookId number,
 mybookName varchar2,
 mypublisher varchar2,
 myPrice number
) 
as 
 mycount number;--begin������ ����� ����`
begin 
       --1. �Է¹��� bookname���� ��ȸ�� ��� ���� mycount�� ���� 
       select count(*)  into mycount -- seelct Į���� into ���� 
         from book 
       where bookname like mybookName;

       -- if ���� then ���๮; else ���๮ end if;
       if  mycount!=0 then -- mybookName�� ��ȸ�� ������� ������ 
            update book
                  set price = myPrice   -- ������ �Է¹��� ������ ����
            where  bookname like mybookName;
       else -- mycount==0  -- �Է�
            insert into book(bookid, bookname, publisher, price)
              values(mybookId,mybookName,mypublisher,myPrice);
       end if;
end;


*/
