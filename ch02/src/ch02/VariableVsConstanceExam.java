package ch02;

public class VariableVsConstanceExam {

	public static void main(String[] args) {
	 int x = 10;
	 int y;

	 y = 20;
	 x= 20;
	 System.out.println(x+y);
	 
	 //��� ����
	 //final Ÿ�� ������ = ��;
	 //����� �Ϲ������� �빮�ڷ� ǥ����.(������ ����)
	 final double PI = 3.141592;
	 //������ r=5 �� ���� ����
	 // PI*r*r
	 //�Ǽ�Ÿ�� ������ �����ϰ� �Ǽ� ����PI�� ���� ����5�� ������ ������� ����
	 double area = PI*5*5;// 3.141591 * 5.0 *5.0
	 
	 //���
	 System.out.println(area);//�Ǽ������� ���
	 
	 //����� ����� ������ ���� �ʱ�ȭ �� ����� �����߻���.
	 //PI = 3.14;
	 area = PI*5*5;
	 //���
	 System.out.println(area);
	 
	}
}
