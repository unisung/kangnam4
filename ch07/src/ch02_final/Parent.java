package ch02_final;

public class Parent {
  void method1() {}
  //final �޼ҵ� - �ڽ�Ŭ�������� ������ �Ұ�
  final void method2() {System.out.println("hello");}
}

class Child extends Parent{
	//������
	void method1() {System.out.println("������");}
	//������ �Ұ�
	//void method2() {}
}

