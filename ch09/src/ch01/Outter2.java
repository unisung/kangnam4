package ch01;

//�ڹ�8 ���� ǥ�����
public class Outter2 {
	void method(int arg) {
		//arg=100;
		int localVariable;
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
