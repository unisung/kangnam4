package ch06_methods_01;

public class Ex01 {
	public static void main(String[] args) {
		//��ü ����
		A1 a1 = new A1();
		//�޼ҵ�ȣ�� - ��������.�޼ҵ��(��,��);
        a1.add(10, 10);//�⺻Ÿ�� �� ����
        a1.print("hello");//����Ÿ�� �� ����
	}
}
class A1{
	    //�⺻Ÿ�� �Ű�����
		void add(int x, int y) {
			System.out.println("�հ�:"+(x+y));
		}
		//����Ÿ�� �Ű�����
		void print(String msg) {
			System.out.println("���޻���:"+msg);
		}
}