package ch02;

import java.util.Scanner;

public class TryWithResourcesEx {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String msg = scanner.next();
	System.out.println(msg);
	int number = scanner.nextInt();
	System.out.println(number);
	//자원해제
	scanner.close();
}
}
