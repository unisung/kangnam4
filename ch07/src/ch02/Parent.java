package ch02;

public class Parent {
	public static void main(String[] args) {
		Child child = new Child();
		child.method3();
	}
 void method1() {}
 void method2() {System.out.println("�θ�޼ҵ�");}
}
//���
class Child extends Parent{
	//������ - �����{}�� �ٽ� ����.
	void method2() {System.out.println("�ڽĸ޼ҵ�");}
	//�߰�
	void method3() {
		method2();
		//�θ�Ŭ������ �޼ҵ� ȣ�� :��������� super.�θ�޼ҵ�()�� ���.
		super.method2();
	}
}
