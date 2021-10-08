package verify;

import java.util.Scanner;

public class StockApplication {
	//타입[] 변수
	//클래스[] 변수
	private static String[] strArray = new String[100];
	private static Stock[] stockArray = new Stock[100];//[null][null][null][null]..[null]-100개
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args){
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.재고생성 |2.재고목록 |3.입고 |4.출고|5.종료");
		 System.out.println("--------------------------------------");
		 System.out.println("선택>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: stockList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
		
	}
	
	//재고생성하기 - Ctrl + F
	private static void createStock() {
		System.out.println("------");
		System.out.println("재고생성");
		System.out.println("------");
		
		System.out.print("상품명:");
		String name = scanner.next();
		System.out.print("초기재고:");
		int qty = scanner.nextInt();
		
		Stock stock = new Stock(name, qty);
		
		//[Stock][Stock][Stock][][][][][][][][][][][][][][][][]...[]
		
		stockArray[idx++] = stock;
		
		System.out.println("결과:재고가 생성되었습니다.");
	}
	//재고목록보기
	private static void stockList() {
		System.out.println("------");
		System.out.println("재고목록");
		System.out.println("------");
		
		//객체 참조타입 배열을 순차적으로 읽으면서 참조변수가 null이 아닐때만 출력.
		 for(int i=0;i<stockArray.length;i++) { //오류발생
			 Stock stock =stockArray[i];
			 if(stock!=null) {
				 System.out.println(stock.toString()); //null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
			 }
		  }
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("입고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("입고수량");
		int qty = scanner.nextInt();
		Stock stock = findStock(item);
		if (stock != null) {
			stock.setQty(stock.getQty() + qty);
            System.out.println("결과:입고가 성공되었습니다.");
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		}
	}
     //출고하기	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("출고수량");
		int qty = scanner.nextInt();
		Stock stock = findStock(item);
		if (stock != null) {
			if (stock.getQty() - qty >= 0) {
				stock.setQty(stock.getQty() - qty);
				System.out.println("결과:출고가 성공되었습니다.");
			}else {
				System.out.println("결과:재고가 부족합니다.");
			}
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		} 
	}
     // [Stock][Stock][null][null][Stock][null].....[null]
	//Stock 배열에서 ano와 동일한 Stock 객체 찾기-
	//참조타입 배열의 값 비교
	private static Stock findStock(String item) {
		Stock stock=null;//로컬변수
		for(int i=0;i<stockArray.length;i++) {
			  stock =stockArray[i];
			if(stock!=null) {  
			  if(stock.getItem().equals(item))
				break;//ano에 해당하는 객체 리턴
			}
		}
		return stock;	//배열 전체를 찾아도 없으면 null리턴
	}
}