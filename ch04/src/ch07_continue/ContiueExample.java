package ch07_continue;

import java.util.Scanner;

/* 5���� ������ Ű����� ���� �Է¹ް� �� �� ����鸸 ���� ��� ���*/
public class ContiueExample {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("���� 5���� �Է��ϼ���:");
	int sum=0;
	for(int i=0;i<5;i++) {//�ݺ� Ƚ���� ���� i
		int n = scanner.nextInt();
		if(n<0) continue;//������ ��� skip�ϱ�
		else
			sum+=n;//����� ��� ���ϱ�
	}
	System.out.println("����� ����:"+sum);
	//1.7autocloseable
    scanner.close();

	}
}
