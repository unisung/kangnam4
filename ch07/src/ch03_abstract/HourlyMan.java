package ch03_abstract;

public class HourlyMan extends Employee {
	//�ʵ�
	int workHour, moneyPerHour;
	//������
	public HourlyMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}
	
	//�޿����
	int computePay() {
		sal=workHour*moneyPerHour;
		return sal;
	}
	

}
