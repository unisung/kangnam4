package ch06_methods_01;

public class Ex05 {
public static void main(String[] args) {
	//��ü ����
	E1 e1 = new E1();
	e1.greet(7);
}
}

class E1{
	//�Ű�����O, ����Ÿ��X
	//�ڱ��ڽ��� ȣ���ϴ� �޼ҵ� - ���ȣ�� �޼ҵ�
	void greet(int x) {
		System.out.println("�ȳ�: "+x);
		if(x<1) return;//void�޼ҵ峻�� return�� ���� ����.
		greet(--x);
	}
}
