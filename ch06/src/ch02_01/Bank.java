package ch02_01;
//������� Ŭ����(���赵) 
public class Bank {
	//�����ܰ� �ݾ� �ʵ�
private int balance=0;
	//�Աݱ��
public void deposit(int amount) {
		balance +=amount;
}
//���
public void witdraw(int amount) {
		if(balance-amount>=0)
		balance -=amount;
}

//�ܰ� ���
public void currentBalance() {
		System.out.println("�ܰ�:"+balance);
	}
}

