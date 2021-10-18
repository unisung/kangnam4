package verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	//List로 변경
	static List<Account> accountList  = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		 System.out.println("------------------------------------------");
		 System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.이체|6.종료");
		 System.out.println("------------------------------------------");
		 System.out.println("선택>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createAccount(); break;
		 case 2: accountList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: transfer(); break;
		 case 6: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
		
	}
	//1번계좌의 balance-=amount, 2번계좌의 balance+=amount;
	private static void transfer() {
		System.out.println("------");
		System.out.println("이체");
		System.out.println("------");
		System.out.print("보내는 계좌번호");
		String ano1 = scanner.next();
		System.out.print("받는 계좌번호");
		String ano2 = scanner.next();
		System.out.print("이체액");
		int amount = scanner.nextInt();
		if(findAccount(ano1)==null ||findAccount(ano2)==null) {
			System.out.println("계좌번호를 확인하세요!!");
		}else {
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2);
			a1.setBalance(a1.getBalance()-amount);
			a2.setBalance(a2.getBalance()+amount);
		}
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
		
		accountList.add(acc);
		
		System.out.println("결과:계좌가 생성되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계계좌목록");
		System.out.println("------");
		
		//
		 for(int i=0;i<accountList.size();i++) {
			    accountList.get(i);
		 }
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("예금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
            System.out.println("결과:예금이 성공되었습니다.");
		}else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		}
	}
     //출금하기	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("출금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("결과:출금이 성공되었습니다.");
			}else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}else {
			System.out.println("결과:계좌번호를 확인해주세요.");
		} 
	}
     
	//Account 배열에서 ano와 동일한 Account 객체 찾기-
	//참조타입 배열의 값 비교
	private static Account findAccount(String ano) {
		Account account=null;//로컬변수
		for(int i=0;i<accountList.size();i++) {
			  account =accountList.get(i);  
			  if(account.getAno().equals(ano))
				break;//ano에 해당하는 객체 리턴
		}
		return account;	//배열 전체를 찾아도 없으면 null리턴
	}
}