package ch01;

//�����ڴ� ��ӿ��� ���ܵ�.
public class GrandParent {
	public GrandParent() {
		System.out.println("�ֻ��� �θ�����ڴ� ���� ���߿� ȣ�������,������ ���������.");
	}
}
//��ӵ� Ŭ������ �����Ͻ� �ڽĻ����ڿ� super()�޼ҵ尡 �ڵ��߰���.
class Parent extends GrandParent{
	public Parent() {
		//super();
      System.out.println("�ڽ�Ŭ������ ���� ȣ��� �� �θ�Ŭ������ ȣ��, �θ�Ŭ���� ���� �� �����.");
	}
}

class Child extends Parent{
	public Child() {
		//super();
     System.out.println("���� ���� ȣ�������, ������ �θ������ �Ϸ��� ���� ���߿� �����.");
	}
}