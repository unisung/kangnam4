package ch01_If;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner��ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���-������:");
		
		int score = scanner.nextInt();
		//������ ���̸� ��{}����
		//if(score>=80) {
		//	System.out.println("�����մϴ�. �հ��Դϴ�.");
		//}
		//dangling����
		if(score>=80) 
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		
		//�ڿ�����
		scanner.close();
		

	}
}
