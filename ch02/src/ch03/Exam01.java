package ch03;

public class Exam01 {
	public static void main(String[] args) {
		// ������ ����
		//int x = 1.5; //1.����(int)Ÿ�� ������ �Ǽ�(double)Ÿ�� ������ �� ���� ����. 
		int x = (int)1.5;//1.5 -> ���� 1�� ������ �ٲ�
		
		//int 2nd = 20;//2.�����ĺ��� �̸� ����Ģ���� ���ڷ� ���۵Ǵ� ���� ����Ұ�.
		 int nd2 = 20;
		 
		//int myMoney# = 25;//3.������ '$'�� '_'���� Ư������ ���Ұ�.
		int myMoney = 25;
		
		//float f = 12.25;//4.�Ǽ�(double)Ÿ���� ���ͷ��� �Ǽ�(float)���� ������ ���� �Ұ�
		float f = (float)12.25;
		
		//int result = 12 + 15.3;//5.���� + �Ǽ� => �Ǽ� + �Ǽ� =>�Ǽ��� �������� ���� ���� �Ұ�
		int result = 12 + (int)15.3;
		
		//String _name = 'ȫ�浿';//6.char(����)''Ÿ���� ���ͷ��� 1��,String(���ڿ�)""�� ��ȯ�ؾ���.
		String _name = "ȫ�浿";		
	}
}