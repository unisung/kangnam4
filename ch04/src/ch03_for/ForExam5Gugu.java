package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
	 System.out.println("���� ���� ��������?");
	 int num = scanner.nextInt();
	 System.out.println("������ "+num+"��");
	 for(int i=1;i<=9;i++) {
		 System.out.print(num+"*" +i+"="+i*num+"\t");
	 }
	 
		
	}
}
