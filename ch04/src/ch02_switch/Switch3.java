package ch02_switch;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner 
       = new Scanner(System.in);
     int money = scanner.nextInt();
     switch(money/1000) {
     case 0:System.out.println("�ɾ� ��");break;
     case 1:System.out.println("������ Ÿ");break;
     case 2:System.out.println("���� Ÿ");break;
     case 3:System.out.println("�ý� Ÿ");break;
     default:System.out.println("�� ��� ��");break;
    
     
     
     }
     
		
	}
}
