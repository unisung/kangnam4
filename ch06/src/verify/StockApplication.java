package verify;

import java.util.Scanner;

public class StockApplication {
	//Ÿ��[] ����
	//Ŭ����[] ����
	private static String[] strArray = new String[100];
	private static Stock[] stockArray = new Stock[100];//[null][null][null][null]..[null]-100��
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args){
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.������ |2.����� |3.�԰� |4.���|5.����");
		 System.out.println("--------------------------------------");
		 System.out.println("����>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: stockList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("���α׷� ����");
		
	}
	
	//�������ϱ� - Ctrl + F
	private static void createStock() {
		System.out.println("------");
		System.out.println("������");
		System.out.println("------");
		
		System.out.print("��ǰ��:");
		String name = scanner.next();
		System.out.print("�ʱ����:");
		int qty = scanner.nextInt();
		
		Stock stock = new Stock(name, qty);
		
		//[Stock][Stock][Stock][][][][][][][][][][][][][][][][]...[]
		
		stockArray[idx++] = stock;
		
		System.out.println("���:��� �����Ǿ����ϴ�.");
	}
	//����Ϻ���
	private static void stockList() {
		System.out.println("------");
		System.out.println("�����");
		System.out.println("------");
		
		//��ü ����Ÿ�� �迭�� ���������� �����鼭 ���������� null�� �ƴҶ��� ���.
		 for(int i=0;i<stockArray.length;i++) { //�����߻�
			 Stock stock =stockArray[i];
			 if(stock!=null) {
				 System.out.println(stock.toString()); //null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
			 }
		  }
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("------");
		System.out.println("�԰�");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("�԰����");
		int qty = scanner.nextInt();
		Stock stock = findStock(item);
		if (stock != null) {
			stock.setQty(stock.getQty() + qty);
            System.out.println("���:�԰� �����Ǿ����ϴ�.");
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}
     //����ϱ�	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("������");
		int qty = scanner.nextInt();
		Stock stock = findStock(item);
		if (stock != null) {
			if (stock.getQty() - qty >= 0) {
				stock.setQty(stock.getQty() - qty);
				System.out.println("���:��� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:��� �����մϴ�.");
			}
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		} 
	}
     // [Stock][Stock][null][null][Stock][null].....[null]
	//Stock �迭���� ano�� ������ Stock ��ü ã��-
	//����Ÿ�� �迭�� �� ��
	private static Stock findStock(String item) {
		Stock stock=null;//���ú���
		for(int i=0;i<stockArray.length;i++) {
			  stock =stockArray[i];
			if(stock!=null) {  
			  if(stock.getItem().equals(item))
				break;//ano�� �ش��ϴ� ��ü ����
			}
		}
		return stock;	//�迭 ��ü�� ã�Ƶ� ������ null����
	}
}