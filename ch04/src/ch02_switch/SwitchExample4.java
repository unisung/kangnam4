package ch02_switch;

import java.util.Scanner;

public class SwitchExample4 {
	public static void main(String[] args) {
     //월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
	 // 1   , 2    , 3,    4,     5,     6,    0
	 //월~목요일(1~4):열심히 공부합니다.
	 //금요일(5):쇼핑을 합니다.
	 //토요일,일요일(6,0): 레저를 즐깁니다.
     // random()이용해서 값을 받아서 출력
	 int weekDay = (int)(Math.random()*7);// 0<= < 7
		
	 System.out.println(weekDay);
	 
	 switch(weekDay) {
	 //월~목요일:열심히 공부합니다.
	 //금요일:쇼핑을 합니다.
	 //토요일,일요일: 레저를 즐깁니다.
	 case 1: 	 case 2:	 case 3:	 
	 case 4: System.out.println("열심히 공부합니다."); break;
	 
	 case 5: System.out.println("쇼핑을 합니다."); break;
	 
	 case 6: 
	 case 0: System.out.println("레저를 즐깁니다."); break;
	 }
	 
	}
}
