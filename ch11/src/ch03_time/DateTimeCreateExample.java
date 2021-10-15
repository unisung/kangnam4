package ch03_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* java 1.8에 추가된 time패키지*/
public class DateTimeCreateExample {
	public static void main(String[] args) {
	 //날짜 얻기
	 LocalDate currDate = LocalDate.now();
	 System.out.println("현재 날짜:"+currDate);
	 
	 LocalDate targetDate=LocalDate.of(2024, 5, 10);
	 System.out.println("목표 날짜:"+targetDate);
	 
	 //시간
	 LocalTime currTime = LocalTime.now();
	 System.out.println("현재 시간:"+currTime);
	
	 LocalTime targetTime = LocalTime.of(6,30,0,0);
	 System.out.println("목표 시간:"+targetTime);
	 
	 //날짜시간
	 LocalDateTime currDateTime = LocalDateTime.now();
	 System.out.println("현재 날짜와 시간:"+currDateTime);
	 
	 LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
	 System.out.println("목표 날짜와 시간:"+targetDateTime);
	 
	 

	}
}
