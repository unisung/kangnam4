package verify;

public class Ex11 {
public static void main(String[] args) {
	System.out.println("���� 100�� 300���� ���� �ڽ̵� Integer��ü�� == �����ڷ� ���߽��ϴ�, "
			+ "100�� �ڽ��� Integer��ü�� true�� �����µ� 300�� ��ڽ��� Integer��ü�� false�� ������\r\n"
			+ "������ �����غ�����");
	Integer obj1 = 100;
	Integer obj2 = 100;
	Integer obj3 = 300;
	Integer obj4 = 300;
	
	System.out.println(obj1==obj2);
	System.out.println(obj3==obj4);//p.532
	
	// byte,short,int Ÿ���� ���� �񱳹��� -128~127 ������ ==�����ڷ� �� ����
	//������ ����� equals()�޼ҵ带 ����ؾ���.
	System.out.println(obj3.equals(obj4));
	  	
}
}
