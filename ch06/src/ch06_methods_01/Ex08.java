package ch06_methods_01;

public class Ex08 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.multiply(10, 15);
		System.out.println("�հ�:"+a.add(23,56));
		double d1 = a.square(3.5);
		System.out.println("����: "+d1);
	}
}
class A3{
	//1����(�Ű�����O,����Ÿ��O)
	int add(int a1, int a2) {
		return a1 + a2;
	}
	//1����(�Ű�����O,����Ÿ��O)
	double square(double d) {
		return d*d;
	}
	//3����(�Ű�����O,����Ÿ��X)
	void multiply(int a1, int a2) {
		System.out.printf("%d * %d = %d\n",a1,a2,a1*a2);
	}
}