package ch08;

public interface InterA {
	//�߻�޼ҵ�
  void method();
}

//�߻� �޼ҵ带 �����ϴ� �߻�Ŭ����
abstract class A implements InterA{
	//�߻�޼ҵ�� ����(�߻�޼ҵ�� ������)
	public abstract void method();
}
//�߻�Ŭ������ ��ӹ��� ��ü Ŭ����
class B extends A{
	@Override
	public void method() {}//�����
}