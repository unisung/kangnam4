package ch05_DoWhile;

import java.util.Scanner;

public class DoWhile3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num=0,i=1;
	do {
		System.out.println("���� ���� ������ ���ڸ� �Է��ϼ���.");
		num = scanner.nextInt();
		if(num <=9 && num>=2) {
			do {
				System.out.print(num+"*"+i+"="+(num*i)+"\t");
		         i++;//���� ���� 		
			}while(i<=9);
		}	
	}while(num>9 || num <2); //���� ����� ����
}
}
