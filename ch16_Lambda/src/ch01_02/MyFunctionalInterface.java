package ch01_02;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void method(int x);
	default void method2(int x) {}
	//public void method3(int x,int y);
}
