package verify;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];//[null][null][null][null]..[null]-100��
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��-
	//����Ÿ�� �迭�� �� ��
	private static Account findAccount(String ano) {
		  Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			  account =accountArray[i];
			if(account.getAno().equals(ano))
				return account;
		}
		return account;		
	}
}