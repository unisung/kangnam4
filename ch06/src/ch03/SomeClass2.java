package ch03;
//멤버-필드, 메소드, 생성자
public class SomeClass2 {
	//필드
	int f1;//정수타입 값을 저장하는 변수 - 클래스범위에서 선언된 변수-field-초기화를 해야 읽을 수 있음.
	       //클래스 범위에서 선언된 필드는 해당 타입의 기본값으로 (자동)초기화됨
	
	//생성자-필드초기화
    SomeClass2(){this.f1=10;}
	
	//메소드
	void method() {
	 int f1=0; //정수타입 값을 저장하는 변수- 메소드 블럭 범위에서 선언된 변수-local변수
	 System.out.print(this.f1);//this.변수명 =>this.필드명 :여기서 this는 클래스를 가리킴
	 //필드접근방법 .표기법
	 //클래스명.필드 -> 클래스내에서의 .표기법 접근 -> this.f1;//
	 //필드명과 메소드내에서 선언된 로컬변수명이 같을 때 구분하는 방법으로 사용됨.
	 //this.변수명(필드) 과 변수명(로컬변수) 으로 구분됨.
	}
	
	void method2() {
		this.f1=10;
		System.out.println(f1);//오류가 안나는 이유?
	}
}
