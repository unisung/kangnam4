package ch02;

import java.util.Scanner;

public class TryWithResourcesEx2 {
	public static void main(String[] args) {
	Scanner scanner=null;
	try{
	  scanner = new Scanner(System.in);
	String msg = scanner.next();
	System.out.println(msg);
	int number = scanner.nextInt();
	System.out.println(number);
	
	}catch(Exception e) {
		System.out.println("���ܹ߻�");
	}finally{
		System.out.println("�ڿ�����");
	//�ڿ�����
		scanner.close();
	}
}
}
