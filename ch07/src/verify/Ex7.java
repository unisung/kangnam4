package verify;

public class Ex7 {
public static void main(String[] args) {
	SnowTire snowTire = new SnowTire();
	Tire tire = snowTire;//promotion(upcasting)
	
	//�������̵��� �޼ҵ��� �������ε� 
	//�޼ҵ��� ���೻���� ȣ������� ����
	//�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ÿ������ �� ��ȯ�� �Ǿ
	//�ڽ�Ŭ�������� �����ǵ� �޼ҵ��� ������ ����� - ������
	snowTire.run();
	tire.run();
}
}
class Tire{
	public void run(){System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");}
}
class SnowTire extends Tire{
	@Override
	public void run() {System.out.println("����� Ÿ�̾ �������ϴ�.");}
}
