package ch02_update;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//�ڹ����α׷��� dbms���� default �ɼ��� autocommit<- commit ��� �������� �ʾƵ� db�� �ڵ� �ݿ� 
public class InsertTest6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		//1.����̹��ε�,2.���ᰴü ����
		try {
			Connection con = DaoConnector.getInstance().getConnection();
			//3.������ü ����
            Statement stmt = con.createStatement();
            //
           String sql="";
           while(run) {  
             System.out.println("����� ������ �Է��ϼ���>");
             String name = scanner.next();
             System.out.println("���� �Աݾ��� �Է��ϼ���>");
             int  balance = scanner.nextInt();
             
            //4.������ ���� 
            //4-3.��� ó��
            sql="insert into account "
  +" values((select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account),'"
  + name+"','"+balance+"')";//�ۼ�
            		//��� ����
            		stmt.executeUpdate(sql);
           //
            System.out.println("����ұ��?(y/n)>");
            String isRun = scanner.next();
            if(isRun.equalsIgnoreCase("n")) run=false;
           }		
            
            //5.��� ��ȸ 
            sql ="select * from account order by accountNo";
            //��ȸ 
           ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));//�ۼ�
            }
            //���
            //-- �̸�, �ܰ� 10000 �Է�
            //--��ϰ�� ��ȸ
            //-- 111-001, 'ȫ�浿', 10000
            //-- 111-002, '������', 10000
            //-- 111-003, '�Ӳ���', 10000
     			//6.�ڿ�����
			stmt.close();  con.close(); scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 --account���̺� ����
create table account(
accountNo varchar2(50)  primary key,
owner  varchar2(100),
balance number
);
 
insert into account values('111-001', 'ȫ�浿',10000);

select * from account;
delete from account;
commit;

select '111'||'-'||lpad(nvl(max(accountno),0)+1,3,'0') 
  from account;
--lpad�Լ�
select lpad(to_number(substr(nvl(max(accountno),0),5,3))+1,3,'0') from account;
  
select lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account;


select '111'||'-'||lpad(to_number(nvl(substr(nvl(max(accountno),0),5,3),0))+1,3,'0') from account;

--- �Է�
-- �̸�, �ܰ� 10000 �Է�
--��ϰ�� ��ȸ
-- 111-001, 'ȫ�浿', 10000
-- 111-002, '������', 10000
-- 111-003, '�Ӳ���', 10000

 * */
 */