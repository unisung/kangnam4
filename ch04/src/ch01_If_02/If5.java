package ch01_If_02;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���");
    int num =  scanner.nextInt();
    String str ="";
    if(num < 10) str ="10�̸�";
    else if(num < 100) str = "10�̻� 100 �̸�";
    else if(num < 1000) str = "100�̻� 1000�̸�";
    else str ="1000�̻�";
    
    System.out.println(str +"�� ���Դϴ�.");
    		
		
	}

}
