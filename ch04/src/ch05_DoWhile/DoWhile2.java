package ch05_DoWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num=0;
		do {
			System.out.println("¦���� �Է��ϼ���:");
			num = scanner.nextInt();
		}while(num%2!=0);//num�� 2�� �������� �� �������� 0�� �ƴѰ��
		System.out.println("����� �Է��� ¦��: "+num);
	}
}
