package ch07_staticVsnotStatic;

public class Ex11 {
	public static void main(String[] args) {
		//ũ������.�޼ҵ�()
	  C3.method2();
	  
	  //��ü ����
	  C3 c=new C3();
	  //��������.�޼ҵ�
	  c.method1();
	  //��������.�޼ҵ�
	  c.method2();

	}
}
class C3{
	void method1() {//non-static���
		System.out.println("�� �ν��Ͻ� �޼ҵ�");
	}
	static void method2() {//statick���
		System.out.println("�� static �޼ҵ�");
	}
}