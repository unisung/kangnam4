package ch02_polymorphism;

public class AA {
	//�ʵ��� ������
	A a=new C();
	//�Ű������� ������
	void m1(A a) {
	}
public static void main(String[] args) {
	 AA a=new AA();
	 a.m1(new A());
	 a.m1(new B());
	 a.m1(new C());
}
}

