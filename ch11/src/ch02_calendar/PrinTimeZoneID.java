package ch02_calendar;

import java.util.TimeZone;

public class PrinTimeZoneID {
	public static void main(String[] args) {
    String[] availableIDs
    =TimeZone.getAvailableIDs();//������ timezone id���
    for(String id:availableIDs)
    	System.out.println(id);
	}
}
