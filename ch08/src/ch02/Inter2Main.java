package ch02;

public class Inter2Main {
public static void main(String[] args) {
	//��üŬ���� ��ü�� �����Ͽ� �ڼ� �������̽��� ����(promotion)
	H4 h4 = new H5();
	//������
	h4.h1();
	h4.h2();
	h4.h3();
	h4.h4();
  }
}
//�θ��������̽�
interface H1{void h1();}
//�ڽ��������̽�
interface H2 extends H1{void h2();}//�߰��� �޼ҵ�
//�ڽ��������̽�
interface H3 {void h3();}//�߰��� �޼ҵ�

//�ڼ��������̽�-���߻�ӵ� ��� �θ�Ŭ������ ���� ������ �߻�޼ҵ带 ��� �����Ͽ� �������ִ�.
interface H4 extends H2, H3{void h4();}//�߰��� �޼ҵ�
//��ü Ŭ����
class H5 implements H4{
	@Override
	public void h2() { }//������
	@Override
	public void h1() {	System.out.println("�� h1 �޼ҵ�");	}
	@Override
	public void h3() { System.out.println("���");}
	@Override
	public void h4() {System.out.println("aa"); }
}
