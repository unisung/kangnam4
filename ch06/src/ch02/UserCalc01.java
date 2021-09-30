package ch02;

import java.util.Scanner;

public class UserCalc01 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("두개의 정수를 입력하세요.");
	 System.out.println("첫 번째 정수>");
	 int x=scanner.nextInt();
	 System.out.println("첫 번째 정수>");
	 int y=scanner.nextInt();
	 //Calc01객체 생성
	 Calc01 cal=new Calc01();
	 int result1=cal.add(x, y);
	 int result2=cal.sub(x, y);
	 System.out.println(result1);
	 System.out.println(result2);
		
	}
}
