package ch02;
/* Ctrl + Shift + o */
import java.util.Scanner;

public class ArithmeticExam3 {
	public static void main(String[] args) {
		int input = 10;
		Scanner scanner = new Scanner(System.in);
		//�� �Է�
		System.out.println("������ �Է��ϼ���:");
		input = scanner.nextInt();
		//���ڸ� Ű������Է¹޾Ƽ� ¦��/Ȧ��
		if(input % 2 == 0) {//¦��
		   System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}	
	}
}
