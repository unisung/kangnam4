package ch02_polymorphism;

public class A {
public static void main(String[] args) {
	B b=new B();
	C c=new C();
	D d=new D();
	E e=new E();
	
	//대입 - promotion
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1=d;
	C c1=e;
	
	//불가능 - 상속관계가 아님.
	//B b3=e;
	//C c2=d;
	
	//처음에 B타입으로 생성 후 부모타입으로 promotion후 다시 원래타입(B타입)으로 casting가능.
	B b4 =(B)a1;
	
}
}
class B extends A{}
class D extends B{}

class C extends A{}
class E extends C{}
