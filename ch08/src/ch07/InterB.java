package ch07;

public interface InterB extends InterA{
	//�߻�޼ҵ�� ������
  void method2();
}
class B implements InterB{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
    //�߻�޼ҵ�� ������ �Ǿ���.
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}