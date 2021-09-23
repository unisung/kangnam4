package ch03;

import java.util.Scanner;//ctrl + shitf + o

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //스캐너 객체 생성	
     Scanner scanner = new Scanner(System.in);
     System.out.println("입력:");
     //스캐너는 값 입력 후 Enter키를 치면  값다음의 \r\n을 제거 후 input변수에 저장함.
	 String input = scanner.next();
	 //타입변환 없이 문자열 형태로 출력
     System.out.println(input);
	}

}
