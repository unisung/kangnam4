package ch01_01;

public class A {
	public static void main(String[] args) {
		B b;
		b=new B();
	}
	//default
	public A() {
		System.out.println("������A");
	}
	//�Ϲ�
	public A(int X) {
		System.out.println("������"+X);
	}
}
class B extends A{
	//default������
	public B() {
		System.out.println("������B");	
	}
}
