package ch02;

public class ArithmeticExam {
	public static void main(String[] args) {
		int time = 5000;
		
		System.out.println("�ú��ʷ� ����ϱ�");
		
		//��� ������
		int second = time % 60; //5000�� = minute * 60 + ������ ��
		int minute = (time/60) % 60;//
		int hour = (time/60)/60;//
		
		System.out.println(time + "�ʴ�");
		System.out.println(hour + "�ð�");
		System.out.println(minute+ "��");
		System.out.println(second + "���Դϴ�.");
	}

}
