package ch02;

import java.util.Scanner;

public class TryWithResourcesEx3 {
	public static void main(String[] args) {
    //�ڿ��� ������ try()���� ����
    //����� ������ �ڿ��� �ڵ� ����
	//try()���� ����Ǵ� ��ü�� Autocloseable�������̽��� ������ ��ü�� ����.
	try(Scanner scanner = new Scanner(System.in)){
	  
	String msg = scanner.next();
	System.out.println(msg);
	int number = scanner.nextInt();
	System.out.println(number);
	
	}catch(Exception e) {
		System.out.println("���ܹ߻�");
	}
}
}
