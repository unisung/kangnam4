package ch02;

import java.util.Scanner;

public class UserCalc01 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("�ΰ��� ������ �Է��ϼ���.");
	 System.out.println("ù ��° ����>");
	 int x=scanner.nextInt();
	 System.out.println("ù ��° ����>");
	 int y=scanner.nextInt();
	 //Calc01��ü ����
	 Calc01 cal=new Calc01();
	 int result1=cal.add(x, y);
	 int result2=cal.sub(x, y);
	 System.out.println(result1);
	 System.out.println(result2);
		
	}
}
