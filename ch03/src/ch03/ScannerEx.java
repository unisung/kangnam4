package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("이름,도시, 나이,체중, 독신 여부를 빈칸으로 분리하여 입력하세요:");
    //스캐너타입 변수 선언 및 객체 생성 
    Scanner scanner = new Scanner(System.in);
    
    String name = scanner.next();//String next()
    System.out.print("이름은 "+name+", ");
		
    String city = scanner.next(); //String next()
    System.out.print("도시는 "+city+", ");
    
    int age = scanner.nextInt();//int nextInt()
    System.out.print("나이는 "+age+"살, ");
		
    double weight = scanner.nextDouble();//double nextDouble() 
    System.out.print("체중은 "+weight+"kg, ");
    
    boolean single = scanner.nextBoolean();//boolean nextBoolean()
    System.out.println("독신여부는 "+single+"입니다.");
    
    //자원해제
    scanner.close();
    
		
	}
}
