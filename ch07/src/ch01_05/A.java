package ch01_05;

//�θ�Ŭ������ �����ڸ� �����Ͽ� ȣ�� super();
public class A {
	public static void main(String[] args) {
		B b;
		b=new B();//�θ�Ŭ������ �Ű����� ������ ȣ��.
	}
	public A() { System.out.println("������A"); }
	//�Ϲ�
	public A(int X) { System.out.println("������"+X);	}
}
class B extends A{
	//default������
	public B() { 
		super(5);//�θ�Ŭ������ ������ �߿� intŸ���� �Ű����� �ִ� �����ڸ� �����Ͽ� ȣ��.
		System.out.println("������B");
	}
	//super()�޼ҵ�� �θ�Ŭ������ �Ű����� �ִ� ������ ȣ�� ����.
	public B(int x) { 
		super(x);
		System.out.println("�Ű�����������"); 
	}
}
