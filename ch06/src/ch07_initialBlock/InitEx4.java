package ch07_initialBlock;
public class InitEx4 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print(); p2.print();  p3.print();
	}
}
class Product{
	//static�ʵ�
	static int cnt;
	//�ν��Ͻ� �ʵ�
	int serialNo;
	//�ν��Ͻ� �ʱ�ȭ ��
	{
		cnt++;//static�ʵ� ����
		serialNo=cnt;//������ static�ʵ� ���� ��ü ������ �� �ν��Ͻ� ������ ����
	}
	//�ν��Ͻ� �޼ҵ�
	void print() {
		System.out.println("��ǰ ��ȣ: " + serialNo);
	}
}