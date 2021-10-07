package verify;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];//[null][null][null][null]..[null]-100개
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.종료");
		 System.out.println("--------------------------------------");
		 System.out.println("선택>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createAccount(); break;
		 case 2: accountList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
		
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("결과:계좌가 생성되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계계좌목록");
		System.out.println("------");
		
		//객체 참조타입 배열을 순차적으로 읽으면서 참조변수가 null이 아닐때만 출력.
		 for(int i=0;i<accountArray.length;i++) { //오류발생
			 Account account =accountArray[i];
			 if(account!=null)
		   System.out.println(account.toString()); //null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
		  }
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("입금");
		/*
		 * String ano = scanner.next(); int amount = scanner.nextInt(); Account acc =
		 * findAccount(ano); if(acc!=null) acc.setBalance(acc.getBalance()+amount);
		 */
	}
     //출금하기	
	private static void withdraw() {
		System.out.println("출금");
		/*
		 * String ano = scanner.next(); int amount = scanner.nextInt(); Account acc =
		 * findAccount(ano); if(acc!=null) { if(acc.getBalance()-amount>=0) {
		 * acc.setBalance(acc.getBalance()-amount); } }
		 */
	}

	//Account 배열에서 ano와 동일한 Account 객체 찾기-
	//참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		  Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			  account =accountArray[i];
			if(account!=null) {  
			  if(account.getAno().equals(ano))
				return account;
			}
		}
		return account;		
	}
}