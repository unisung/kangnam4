package ch07_staticVsnotStatic;

public class FruitMain {
	public static void main(String[] args) {
		//��ü���� �����Ҽ� �ִ� ��� - static���
		 Fruits f1 = new Fruits(10);
		 Fruits f2 = new Fruits(50);
		 Fruits f3 = new Fruits(30);
		 System.out.println("ù��° �Һ�:"+f1.amount);
		 System.out.println("�ι�° �Һ�:"+f2.amount);
		 System.out.println("����° �Һ�:"+f3.amount);
		 System.out.println("���� ���Ϸ�:"+ Fruits.currentAmount);
	}
}
