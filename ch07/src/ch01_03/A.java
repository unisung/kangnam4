package ch01_03;

//�θ�Ŭ������ default�����ڸ� ȣ��
public class A {
	public static void main(String[] args) {
		B b;
		b=new B(5);
	}
	public A() { System.out.println("������A"); }
	//�Ϲ�
	public A(int X) { System.out.println("������"+X);	}
}
class B extends A{
	//default������
	public B() { System.out.println("������B");}
	//�Ű����������ڵ� �θ�Ŭ������ default�����ڸ� ȣ��.
	public B(int X) { System.out.println("�Ű�����������"); }
}
