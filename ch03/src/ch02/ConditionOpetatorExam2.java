package ch02;

public class ConditionOpetatorExam2 {
	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		// ���� ? �� : ����
		System.out.println("�� ���� ���� "+( a>b ? a-b : b-a ));
		
		// a�� ũ��, b�� ũ��, �� �� ����. 
		// ���� ? �� : (����? �� : ����) 
		System.out.println("�� ���� ���� "+( a>b ? "a�� ũ��" : a<b ? "b�� ũ��" :"����"   ));
		
	}
}
