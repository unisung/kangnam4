package ch01_If;

import java.util.Scanner;

public class MultipleOfThreeExam {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("���� �Է��Ͻÿ�:");
	int number = in.nextInt();
	
	if(number % 3 == 0)
		System.out.println("3�� ����Դϴ�.");
	else
		System.out.println("3�� ����� �ƴմϴ�.");
	
	System.out.println(number%3==0?"3�� ����Դϴ�.":"3�� ����� �ƴմϴ�.");
	
	//�ڿ�����
	in.close();
}
}
