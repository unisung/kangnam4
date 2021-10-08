package ch02_polymorphism;

public class A {
public static void main(String[] args) {
	B b=new B();
	C c=new C();
	D d=new D();
	E e=new E();
	
	//���� - promotion
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1=d;
	C c1=e;
	
	//�Ұ��� - ��Ӱ��谡 �ƴ�.
	//B b3=e;
	//C c2=d;
	
	//ó���� BŸ������ ���� �� �θ�Ÿ������ promotion�� �ٽ� ����Ÿ��(BŸ��)���� casting����.
	B b4 =(B)a1;
	
}
}
class B extends A{}
class D extends B{}

class C extends A{}
class E extends C{}
