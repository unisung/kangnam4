package ch03;

public interface Parent {
  void parentMethod();
}

class Child implements Parent{
	//����Ŭ�������� �߰��� ���
    int childF;//�ʵ�
    void childM() {}//�޼ҵ�
    //����Ŭ�������� �����ǵ� �޼ҵ� 
    //- ���� �������̽����� ����Ǿ��ִ� �޼ҵ�
	@Override
	public void parentMethod() {
		childF=3;
		childM();
	}
}