package ch02_update;

import java.sql.Connection;
import java.sql.Statement;

public class IntsertTest7 {
	public static void main(String[] args) throws Exception{
		//�Է�(transaction)ó��
		//1.����̹��ε�, 2.���ᰴü �����Ͽ� ����α�
		  Connection con = DaoConnector.getInstance().getConnection();
		//3.sql�� ���۰�ü ����
		  Statement stmt = con.createStatement();
		//4.���� ���� �� ��� ó��
		  String sql="insert into customer values((select max(custid)+1 from customer),'ȫ����',null,null)"; 
		  System.out.println("sql:"+sql);
		  int resultCnt = stmt.executeUpdate(sql);
		  if(resultCnt>0) {
			  System.out.println("���强��");
		  }else {
			  System.out.println("�������");
		  }
		//5.�ڿ�����-������ ��ü �� �������� ����
		  stmt.close(); con.close();
	}
}
