package ch06_methods;

public class SomeMethosMain {
	public static void main(String[] args) {
		
		SomeMethods sm = new SomeMethods();
		//�ܺ� ���� SomeMethodsŬ�������� �޼ҵ� ȣ��
		//����������.�޼ҵ��(dot-notation:.ǥ���)���� ȣ��
		sm.run();
		sm.innerMethod();
		sm.stop();
	}
}