package ch01_If_02;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("������ �Է��ϼ���(0~100):");
    int score = scanner.nextInt();
    String grade;
    if(score>=90) grade="A";
    else if(score>=80) grade="B";
    else if(score>=70) grade="C";
    else if(score>=60) grade="D";
    else grade ="F";
    //printf("����1  ����2",��1, ��2);
    // %d�� ���� (digit)����, %s�� ���ڿ�(string) ����
    System.out.printf("������ %d �̰� ������ %s�Դϴ�.",score,grade);
		
	}
}
