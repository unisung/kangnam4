package ch08_member02;

import ch08_member01.B;
import ch08_member01.B2;
import ch08_member01.B3;
import ch08_member01.B4;

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
   void f2() {
	   B3 b3 = new B3();
	   //default�������� ����� �ٸ���Ű���� Ŭ�������� ���ٺҰ�.
	   //�ʵ�
	   //b3.n=10;
	   //�޼ҵ�
	   //b3.g();
   }
   
   void f3() {
	   B4 b4=new B4();
	   //protected���� ����� �ٸ���Ű������ ���� �Ұ�.
	   //b4.n=10;
	   //b4.g();
   }
}
