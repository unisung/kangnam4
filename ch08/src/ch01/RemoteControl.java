package ch01;

//�������̽� ����(����Ÿ��)
//�������̽��� ������� - ���, �߻�޼ҵ� 
public interface RemoteControl {
	//���
	//public static final int MAX_VOLUME=10;
	//public static final int MIN_VOLUME=0;
	public int MAX_VOLUME=10;//����� ����� ���ÿ� �ʱ�ȭ �ؾ���
	public int MIN_VOLUME=0;
	//�޼ҵ�-�߻�޼ҵ�
	void method();//�����

class A {
	//����
	public int MAX_VOLUME=10;//�ڵ����� 0���� �ʱ�ȭ
	//���
	public int MIN_VOLUME=0;
	//�޼ҵ�-�߻�޼ҵ�
	void method() {MAX_VOLUME=10;};//�����
}
	
}
