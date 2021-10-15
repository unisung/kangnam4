package ch02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {
public static void main(String[] args) {
	Calendar cal1 = Calendar.getInstance();
	int year = cal1.get(Calendar.YEAR);
	int month = cal1.get(Calendar.MONTH)+1;
	int date = cal1.get(Calendar.DAY_OF_MONTH);
	System.out.printf("오늘은 %d/%d/%d 입니다.\n",year,month,date);
	
	TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
	
	Calendar cal2 = Calendar.getInstance(timeZone);
	year = cal1.get(Calendar.YEAR);
	month = cal1.get(Calendar.MONTH)+1;
	date = cal1.get(Calendar.DAY_OF_MONTH);
	System.out.printf("오늘은 %d/%d/%d 입니다.\n",year,month,date);
	
	
}
}
