package ch08_member02;

import ch08_member01.B;
import ch08_member01.B2;

public class A {
	//�ٸ� ��Ű���� Ŭ���� ����� public�̹Ƿ� ����� ���� ����.
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
