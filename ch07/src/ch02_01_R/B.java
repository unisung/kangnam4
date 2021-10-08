package ch02_01_R;

import ch02_01_Q.A;

public class B extends A {
   void method() {
	   pub=1;//public
	   pro=1;//protected
	   //def=1;//default - 다른패키지에 있는 부모클래스의 default접근지정자 필드에 접근불가
	   //pri=1;//private - 부모클래스의 private접근지정자 필드 접근불가
   }
}
