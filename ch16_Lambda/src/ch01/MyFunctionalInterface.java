package ch01;

//�Լ��� �������̽� - �߻�޼ҵ尡 1���� �������̽�
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();//�߻�޼ҵ�
	default void defaultMethod() {}//����Ʈ�޼ҵ�
	//public void method2();
}

