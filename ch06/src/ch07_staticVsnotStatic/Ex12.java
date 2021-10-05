package ch07_staticVsnotStatic;

public class Ex12 {
	public static void main(String[] args) {
      Bank bnk = Bank.getBank();
      System.out.println("�ŷ�����: "+bnk.name);
      Bank bnk2 = Bank.getBank();
      System.out.println("�ŷ�����: "+bnk.name);
	}
}
//CalendarŬ���� �� ��ü ó�� �� �ý��ۿ� �ϳ��� ��ü�� �����Ͽ� 
//����ؾ��ϴ� ��� ����ϴ� Ŭ���� ���� ��� - �̱���
class Bank{
	String name;
	//static ���-private
	//�ܺο��� �����Ҽ� ������ ĸ��ȭ
	//Ŭ���� �ε�� BankŬ������ ��ü�� �ʱ�ȭ
	private static Bank b=new Bank("�ϳ�����");//BankŬ���� ���ο��� ���� ����
	//private-�ܺο��� ���� �� �� ������ ĸ��ȭ - new Bank()�� �ܺο��� ���� �Ұ�
	private Bank(String n) {
		name=n;
	}
	//static���
	//�ܺο��� ���� ������ �޼ҵ� - public�� ������.
	static Bank getBank() {
		return b;
	}
}