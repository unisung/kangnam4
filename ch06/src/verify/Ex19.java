package verify;

public class Ex19 {
	public static void main(String[] args) {
    Account1 account = new Account1();
    
    account.setBalance(10000);
    System.out.println(account.getBalance());
    
    account.setBalance(-100);
    System.out.println(account.getBalance());
    
    account.setBalance(2000000);
    System.out.println(account.getBalance());
    
    account.setBalance(300000);
    System.out.println(account.getBalance());
    
	}
}
/* �ܰ�:balance(0(MIN_VALUE)<=������� <=1000000(MAX_VALUE), */
class Account1{
	//�ʵ�
	private int balance;//balance=0;
	final int MIN_VALUE=0;
	final int MAX_VALUE=1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		/*if(balance < MIN_VALUE)
			return;
		if(balance >MAX_VALUE)
			return; */ 
		//if(balance<MIN_VALUE ||balance>MAX_VALUE )
		//	return;
		//this.balance = balance;
		if( balance>=MIN_VALUE && balance<=MAX_VALUE)
			this.balance=balance;
	}
}
