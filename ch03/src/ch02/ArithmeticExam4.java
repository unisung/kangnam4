package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int input = 69;
		
		System.out.println("���ڸ��� ������ �Է��ϼ���:");
		input = sc.nextInt();
		// 2�ڸ� ������ Ű����� �Է¹޾Ƽ� ���
		System.out.println("�����ڸ���:"+(input / 10));//��
		System.out.println("1���ڸ���:"+(input % 10)); //������
	}
}