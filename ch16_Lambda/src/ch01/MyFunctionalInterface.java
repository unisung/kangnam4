package ch01;

//함수적 인터페이스 - 추상메소드가 1개인 인터페이스
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();//추상메소드
	default void defaultMethod() {}//디폴트메소드
	//public void method2();
}

