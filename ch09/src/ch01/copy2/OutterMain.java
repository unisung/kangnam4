package ch01.copy2;

public class OutterMain {
public static void main(String[] args) {
	//�ν��Ͻ� ��ü ����
	A a=new A();
	A.B b = a.new B();
	b.print();
}
}
