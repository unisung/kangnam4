package ch02_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {
public static void main(String[] args) {
	Calendar cal1 = Calendar.getInstance();
	int year = cal1.get(Calendar.YEAR);
	int month = cal1.get(Calendar.MONTH)+1;
	int date = cal1.get(Calendar.DAY_OF_MONTH);
	int hour=cal1.get(Calendar.HOUR_OF_DAY);
	System.out.printf("������ %d/%d/%d %d�� �Դϴ�.\n",year,month,date,hour);
	
	TimeZone timeZone 
	= TimeZone.getTimeZone("America/Cambridge_Bay");
	
	Calendar cal2 = Calendar.getInstance(timeZone);
	year = cal2.get(Calendar.YEAR);
	month = cal2.get(Calendar.MONTH)+1;
	date = cal2.get(Calendar.DAY_OF_MONTH);
	hour=cal2.get(Calendar.HOUR_OF_DAY);
	System.out.printf("������ %d/%d/%d %d�� �Դϴ�.\n",year,month,date,hour);
	
	
}
}
