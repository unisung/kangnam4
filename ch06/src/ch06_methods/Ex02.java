package ch06_methods;

public class Ex02 {
	public static void main(String[] args) {
      Test2 test2 = new Test2();
      test2.age=20;
      test2.name="ȫ�浿";
      //4������ �޼ҵ�
      test2.print();
	}
}

class Test2{
	//�ʵ�
	int age;
	String name;
	// 4���� - �޼ҵ�
	void print() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}