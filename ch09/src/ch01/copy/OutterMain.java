package ch01.copy;

public class OutterMain {
public static void main(String[] args) {
	//Ŭ����.static����� ����
	A.C c =new A.C();
	//C�� �ν��Ͻ����
	c.field1=3;
	c.method1();
	
	//C�� static���
	//�ٱ�Ŭ����.����Ŭ����.���
	A.C.field2=3;
	A.C.method2();
	
}
}
