package ch04.copy.copy.copy;

public class AccountEx {
public static void main(String[] args) throws Exception{
	Acc acc =new Acc("111-001","ȫ�浿",10000);
	//�Ա�
	acc.deposit(10000);
	System.out.println(acc.getBalance());
	//���

	acc.withdraw(15000);
	System.out.println(acc.getBalance());
	
	acc.withdraw(15000);
	System.out.println(acc.getBalance());

}
}
