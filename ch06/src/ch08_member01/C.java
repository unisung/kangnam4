package ch08_member01;

public class C {
 public void k() {
	 B b=new B();
	 b.n=7;
	 b.g();
 }
 
 public void k1() {
	 //������Ű������
	 //Ŭ������ public�̹Ƿ� ���ٰ���
	 B2 b2=new B2();
	 //�ʵ�� �޼ҵ�� private�̹Ƿ�
	 //���� ��Ű���������� ���� �Ұ�
	 //b2.n=10;
	 //b2.g();
 }
}
