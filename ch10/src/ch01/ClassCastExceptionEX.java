package ch01;

public class ClassCastExceptionEX {
	public static void main(String[] args) {
	
	try {
	 Animal animal = new Cat();
	 Cat cat=null;
	System.out.println(cat.toString());
	 Dog dog = (Dog)animal;//예외 발생-프로그램 종료
	 //예외 발생시 아래 명령문 실행 안함
	 System.out.println("형변환 처리");
	}catch(ClassCastException e) {
		System.out.println("고양이는 개가 될수 없음.");
	}finally {
		//명령문 실행
		System.out.println("프로그램 종료");
	}
	}
}
