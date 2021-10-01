package ch03;

public class A {
  int a;
  
/* 필드명과 로컬변수명이 하나의 블럭내에서 같이사용 될때 구분하기 위해 this.로 구분 */
  A(int a){
	 this.a = a;
  }
  void method(int a) {}
}
