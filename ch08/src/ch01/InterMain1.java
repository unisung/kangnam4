package ch01;

public class InterMain1 {
	public static void main(String[] args) {
		//�������̽��� �����ڸ� ȣ���ؼ� ��ü �����Ұ� G1()
		//G1 g1=new G1();
		G2 g2 =new G2();
		G3 g3 =new G3();
		//������ �������̽�Ÿ�� = ��ü�� ������ ��üŬ���� 
		G1 g1 = g2;
		//������-G1�� G2Ÿ������ ��ȯ
		g1.a();
		//������
		g1=g3;
		//G1�� G3Ÿ������ ��ȯ
		g1.a();

	}

}
