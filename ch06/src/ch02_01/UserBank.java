package ch02_01;

public class UserBank {
	public static void main(String[] args) {
		//Bank��ü ����
		Bank bank = new Bank();
		//System.out.println("�ܰ�:"+bank.balance);
		//bank.balance=10000;
		//if(bank.balance - 15000>=0)
		//bank.balance=bank.balance-5000;
		//�Աݱ�� ȣ��
		bank.deposit(10000);
		
		//��ݱ�� ȣ��
		//bank.withdraw(15000);
		
		//�ܰ� ���
		bank.currentBalance();
		

	}

}
