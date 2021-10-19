package verify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	//List�� ����
	static List<Account> accountList  = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		    printMenu();
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
	 System.out.println("���α׷� ����");
	}
	
	private static void printMenu() {
	 System.out.println("------------------------------------------");
	 System.out.println("1.���»��� |2.���¸�� |3.���� |4.���|5.��ü|6.����");
	 System.out.println("------------------------------------------");
	 System.out.println("����>");
	}
	
	//1�������� balance-=amount, 2�������� balance+=amount;
	private static void transfer() {
		System.out.println("------");
		System.out.println("��ü");
		System.out.println("------");
		//������ ����
		System.out.print("������ ���¹�ȣ>");
		String ano1 = scanner.next();
		//�޴� ����
		System.out.print("�޴� ���¹�ȣ>");
		String ano2 = scanner.next();
		//��ü �ݾ�
		System.out.print("��ü��>");
		int amount = scanner.nextInt();
		//������ ���¿� �޴� ���� ��� �¾ƾߵ�.
		if(findAccount(ano1)==null || findAccount(ano2)==null) {
			System.out.println("���¹�ȣ�� Ȯ���ϼ���!!");
		}else {//���¹�ȣ�� ��� ������ ��ü ó��
			Account a1 = findAccount(ano1);
			Account a2 = findAccount(ano2);
			// ������ �� : �ܰ�-��ü��,  �޴� ��: �ܰ�+��ü��
			if (a1.getBalance() - amount >= 0) {
				a1.setBalance(a1.getBalance()-amount);
				a2.setBalance(a2.getBalance()+amount);
				System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
			 }else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		}//��ü ó��
	}
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("������:");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();
		//���� ����
		Account acc = new Account(owner, balance);
		//����Ʈ�� ���
		accountList.add(acc);
		
		System.out.println("���:���°� �����Ǿ����ϴ�.");
	}
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("------");
		System.out.println("����¸��");
		System.out.println("------");
		
		//list���� index��ȣ�� �ش��ϴ� ��ü ��� get(index)
		 for(int i=0;i<accountList.size();i++) {
			    Account account=accountList.get(i);
			    System.out.println(account);
		 }
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();
		System.out.print("���ݾ�");
		int amount = scanner.nextInt();
		//�ش� ���¹�ȣ ã��
		Account acc = findAccount(ano);
		//�ش���� ���� ����Ȯ��
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
            System.out.println("���:������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		}
	}
     //����ϱ�	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("���¹�ȣ");
		String ano = scanner.next();
		System.out.print("��ݾ�");
		int amount = scanner.nextInt();
		//�������� ��ȸ
		Account acc = findAccount(ano);
		//���� ����Ȯ��
		if (acc != null) {//���
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("���:����� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		}else {//��Ȯ�ο�û
			System.out.println("���:���¹�ȣ�� Ȯ�����ּ���.");
		} 
	}
     
	//Account �迭���� ano�� ������ Account ��ü ã��-
	//����Ÿ�� �迭�� �� ��
	private static Account findAccount(String ano) {
		Account account=null;//���ú���
		//list�� ����� ��ü ���� size()
		for(int i=0;i<accountList.size();i++) {
			  account =accountList.get(i);//  
			  if(account.getAno().equals(ano))
				break;//ano�� �ش��ϴ� ��ü ����
		}
		return account;	//�迭 ��ü�� ã�Ƶ� ������ null����
	}
}