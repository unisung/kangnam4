package ch01_If_02;

import java.util.Scanner;

public class If7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("������ �Է��ϼ���(0~100): ");
    int score = scanner.nextInt();//���� �б�
    String grade="A";
    //  ���� >=90 , ���� <95 =>A-, 95==A0,  ���� >95 <=100 => A+
    if(score>=90) { //90~100, 90~95, 95, 95~100
    	grade="A";//90�̻�
    	if(score>95) grade +="+";// "A"+"+" ="A+" // 96~100
    	else if(score==95) grade +="0";//score==95; "A"+"0" ="A0" //95
    	else grade +="-";// "A"+"-" =>"A-"//  90~94
    }
    else if(score>=80) {
        grade="B";//90�̸� �߿��� 80�̻�
    	if(score>85) grade +="+";// "B"+"+" ="B+" // 86~89
    	else if(score==85) grade +="0";//score==85; "B"+"0" ="B0" //85
    	else grade +="-";// "B"+"-" =>"B-"//  80~84
    }
    else if(score>=70) {
    	grade="C";//80�̸� �߿��� 70�̻�
	if(score>75) grade +="+";// 
	else if(score==75) grade +="0";
	else grade +="-";//
   }
    else if(score>=60) {
    	grade="D";//70�̸� �߿��� 60�̻�
    	if(score>65) grade +="+";// 
    	else if(score==65) grade +="0";
    	else grade +="-";//
    }else
    	grade="F";//������(default) 60�̸� ���
    
    System.out.println("������ "+ score +"�̰�, ������ "+ grade + "�Դϴ�.");
}
}
