package verify;

//*�θ������ -super*//
public class Ex5 {
	public static void main(String[] args) {
	
	}
}
/* �θ�����ڿ� default�����ڰ� ��� ���� �߻�*/
class Parent{
	public String name;
	
	//public Parent() {}//1.default������ ����
	public Parent(String name) {
       this.name=name;
	}
}
class Child extends Parent{
	private int studentNo;
	//�Ű����� 2��¥�� ������
	public Child(String name,int studentNo) {
		super(name);//2.super()�޼ҵ� ����Ͽ� �θ�Ŭ������ ���ϴ� ������ ȣ��
		this.name=name;
		this.studentNo=studentNo;
	}
	
}