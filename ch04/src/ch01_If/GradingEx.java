package ch01_If;

import java.util.Scanner;

//���� if-else��
public class GradingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char grade;
     Scanner scanner = new Scanner(System.in);
     System.out.println("������ �Է��ϼ���(0~100): ");
     int score = scanner.nextInt();//���� �б�
     
     if(score>=90) grade='A';//90�̻�
     else if(score>=80) grade='B';//90�̸� �߿��� 80�̻�
     else if(score>=70) grade='C';//80�̸� �߿��� 70�̻�
     else if(score>=60) grade='D';//70�̸� �߿��� 60�̻�
     else grade='F';//������(default) 60�̸� ���
     
     System.out.println("������ "+ grade + "�Դϴ�.");
     
     //�ڿ�����
     scanner.close();
     
		
	}
}
