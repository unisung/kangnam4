package ch01;

public class A {
	int field1;
	void method1() {}
}

class B{}
//�ڹ� Ŭ������ ���ϻ�Ӹ� ���
//���ϻ�� - �θ� �ϳ��� Ŭ����
//class C extends A,B{}
class C extends A{
	//�θ�Ŭ�������� ��ӹ��� �ʵ�� �޼ҵ�� �������� ����.
	//int field1;
	//void method1() {}
	
	//�ڽ�Ŭ�������� �߰��� �ʵ�� �޼ҵ�(����� ���-�ʵ�,�޼ҵ�)
	String field2;
	void method2() {
	  field2="hello";
	  field1=10;//�ҽ��ڵ忡�� �������� ������ ���ٰ����� �ʵ�
	  method1();//�ҽ��ڵ忡�� �������� ������ ���ٰ����� �޼ҵ�
	}
}
//class C extends B{}