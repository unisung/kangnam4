package ch05_enum;

//java.uitl��Ű���� ����.
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* �޷� ���� ��ü - �ý����� �޷� ������ ��üȭ �� �� */
		// Į���� ��ü ���� Calendar.getInstance() <- �̷��� ����
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int daysInYear = cal.get(Calendar.DAY_OF_YEAR);
		int weeksInYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weeksInMonth = cal.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(year+"��");
		System.out.println((month+1)+"��");//��(MONTH)���� 0���� ����
		System.out.println(date+"��");
		System.out.println(week+"��");
		System.out.println("������ "+daysInYear+"��°");
		System.out.println("������ "+weeksInYear+"° ��");
		System.out.println("�̴��� "+weeksInMonth+"° ��");

	}
}
