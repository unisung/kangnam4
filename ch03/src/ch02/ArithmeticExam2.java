package ch02;

import java.util.Scanner;

public class ArithmeticExam2 {
	public static void main(String[] args) {
		int time;
		//Ű����� �Է¹��� ��ĳ�� ��ü ����
		// Ÿ�� ������
		Scanner scanner 
		= new Scanner(System.in);
		
		System.out.println("�ú��ʷ� ����ϱ�");
		System.out.println("����� �ʸ� ������ �Է��ϼ���:");
		time = scanner.nextInt();
		//��� ������
		int second = time % 60; //5000�� = minute * 60 + ������ ��
		int minute = (time/60) % 60;//
		int hour = (time/60)/60;//
		
		System.out.println(time + "�ʴ�");
		System.out.println(hour + "�ð�");
		System.out.println(minute+ "��");
		System.out.println(second + "���Դϴ�.");
	}
}
