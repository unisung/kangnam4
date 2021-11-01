package ch09_savePoint;

import java.sql.Connection;
import java.sql.Savepoint;
import java.sql.Statement;

import ch02_update.DaoConnector;


public class SavePointEx {
	public static void main(String[] args) {
		try {
			//�Է�(transaction)ó��
			//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
			  Connection con = DaoConnector.getInstance().getConnection();
			//3.sql�� ���۰�ü ����
			  Statement stmt = con.createStatement();
			  con.setAutoCommit(false);//����ó��
			  con.commit();
			//4.���� ���� �� ��� ó��
			  String sql="insert into customer values((select max(custid)+1 from customer),'ȫ����',null,null)"; 
			  stmt.executeUpdate(sql);
			 
			  Savepoint s1=con.setSavepoint();
			  
			  sql="insert into customer values((select max(custid)+1 from customer),'�Ǳ浿',null,null)"; 
			  stmt.executeUpdate(sql);
			
			  Savepoint s2=con.setSavepoint();
			  
			   
			  con.rollback(s1);
			  
			  
			 con.commit();
			  
			//5.�ڿ�����-������ ��ü �� �������� ����
			  stmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
/**
 select * from customer;

insert into customer values(10,'��浿','�����','010-111-111');
savepoint s1;-----

select * from customer;
insert into customer values(11,'��浿','�����','010-111-999');
savepoint s2;

select * from customer;


rollback to s2;

rollback to s1;

delete from customer where custid in (10,11);
commit; 
 * */

