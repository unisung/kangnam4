package ch02_switch;

import java.util.Scanner;

public class SwitchExample4 {
	public static void main(String[] args) {
     //������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
	 // 1   , 2    , 3,    4,     5,     6,    0
	 //��~�����(1~4):������ �����մϴ�.
	 //�ݿ���(5):������ �մϴ�.
	 //�����,�Ͽ���(6,0): ������ ���ϴ�.
     // random()�̿��ؼ� ���� �޾Ƽ� ���
	 int weekDay = (int)(Math.random()*7);// 0<= < 7
		
	 System.out.println(weekDay);
	 
	 switch(weekDay) {
	 //��~�����:������ �����մϴ�.
	 //�ݿ���:������ �մϴ�.
	 //�����,�Ͽ���: ������ ���ϴ�.
	 case 1: 	 case 2:	 case 3:	 
	 case 4: System.out.println("������ �����մϴ�."); break;
	 
	 case 5: System.out.println("������ �մϴ�."); break;
	 
	 case 6: 
	 case 0: System.out.println("������ ���ϴ�."); break;
	 }
	 
	}
}
