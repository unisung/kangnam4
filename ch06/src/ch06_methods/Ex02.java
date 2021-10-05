package ch06_methods;

public class Ex02 {
	public static void main(String[] args) {
      Test2 test2 = new Test2();
      test2.age=20;
      test2.name="홍길동";
      //4유형의 메소드
      test2.print();
	}
}

class Test2{
	//필드
	int age;
	String name;
	// 4유형 - 메소드
	void print() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}