package ch03;

public class A {
  //�ʵ带 �����ϰ� �ڽ�(����ü)���� �ʱ�ȭ
	Parent p=new Child();//promotion
	
	void method() {
		//����ü���� �߰��� �����
		//�θ�Ÿ������ ��ȯ�� ���ٺҰ�
		//p.childF=3;
		//p.childM();
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ��
		//�θ�Ÿ������ ��ȯ�� ���ٰ���-�����ǵ� �������
		p.parentMethod();
	}
	//�����������̽� ����
	//����ü(���)�� ���� ParentŸ������ promotion�� ����
	Parent p2=new Parent(){
		//����Ŭ�������� �߰��� ���
	    int childF;//�ʵ�
	    void childM() {}//�޼ҵ�
		@Override
		public void parentMethod() {
			childF=3;
			childM();
		}
	};
	
	void method2() {
		//����ü���� �߰��� �����
		//�θ�Ÿ������ ��ȯ�� ���ٺҰ�
		//p2.childF=3;
		//p2.childM();
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ��
		//�θ�Ÿ������ ��ȯ�� ���ٰ���-�����ǵ� �������
		p2.parentMethod();
	}
}
