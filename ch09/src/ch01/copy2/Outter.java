package ch01.copy2;

//�ڹ�7 ���� ǥ�����
public class Outter {
	void method(final int arg) {
		//arg=100;
		final int localVariable;
		localVariable=1;
		//localVariable=10;
		//����Ŭ���� 
		System.out.println(arg);
		//�޼ҵ峻�� ����Ŭ�������� ���Ǵ� ������
		//������ final �ʵ忩�� �Ѵ�.
		class Innter{
			public void method() {
				int result=arg+localVariable;
			}
		}
	}

}
