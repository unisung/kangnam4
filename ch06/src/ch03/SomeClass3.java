package ch03;
//���-�ʵ�, �޼ҵ�, ������
public class SomeClass3 {
	//�ʵ忡 ���� �����ϴ� ��� 1.����� �ʱ�ȭ
	int f1=10;
	
	//������-�ʵ��ʱ�ȭ
    SomeClass3(){this.f1=10;}//3. �����ڷ� �ʵ带 �ʱ�ȭ 
	
	//�޼ҵ�
	void method() {
	 int f1=0; 
	 System.out.print(this.f1);
	}
	
	void method2() {
		this.f1=10;//2.�޼ҵ忡�� ���� ��ɹ����� �� ����
		System.out.println(f1);
	}
}