package ch02;

public class Person {
	public static void main(String[] arg) {
		Student s=new Student();
		s.set();
	}
	private int weight;//private ��� ���� - public �޼ҵ�� ����
	int age;
	protected int height;
	public String name;

	// �޼ҵ�
	public int getWeight() {	return weight;	}
	public void setWeight(int weight) {		this.weight = weight;	}
}

class Student extends Person {
	public void set() {
		age=30;
		name="ȫ�浿";
		height=175;
		//weight=99;
		setWeight(99);//
	}
}
