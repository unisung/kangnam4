package ch02;

//클래스의 상속의 대상 - 부모클래스의 필드, 메소드
//자식클래스명 extends 부모클래스명{}
public class Truck extends Car{
  //필드(속성,property,맴버변수)
   public String model="truck";

  //메소드  
@Override
public void run() {
	System.out.println("트럭이 달립니다.");
}
   
   
}
