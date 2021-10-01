package ch05_enum;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		//����Ÿ�� ���� ����
		Week today =null;
		//Į����Ÿ���� ���� ����, Į����Ÿ�� ��ü ����(Ŭ������.getInstance()) ����
		Calendar cal = Calendar.getInstance();//Į���ٰ�ü ����
		int week = cal.get(Calendar.DAY_OF_WEEK);//get(������ ���ϰ� : Calendar.DAY_OF_Week)
		System.out.println(week);
		
		//calendar�� ���� ���� ���� ���ڰ��� ���� ���� ���
		switch(week){
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
		}
		System.out.println("������ :"+ today);
			
		//���Ż�� ��
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
			
		}else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}

	}    
}