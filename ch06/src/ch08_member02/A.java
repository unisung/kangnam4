package ch08_member02;

import ch08_member01.B;
import ch08_member01.B2;

public class A {
	//다른 패키지의 클래스 멤버가 public이므로 멤버에 접근 가능.
  void f() {
	  B b=new B();
	  b.n=3;
	  b.g();
  }
   void f1() {
	   B2 b2=new B2();
	   //b2.n=10;
	   //b2.g();
   }
}
