package ch01.copy2;

public class A {
//필드
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
 //인스턴스 멤버 클래스
 class B{
	 //필드
	 String field="Inner-field";
	 void method1() {
		 System.out.println("Inner-method");
	 }
	 
	 void print() {
		 System.out.println(this.field);//Inner
		 this.method1();//Inner
		 System.out.println(A.this.field);//Outter
		 A.this.method();//Outter
	 }
 }
 
}
//class B{}