package ch02;

public class TypeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10; //����
		double y = 15.2; //�Ǽ�
		//doubleŸ���� ����y��
		//������ intŸ������ Ÿ�Ժ�ȯ
		//(Ÿ��)����
		// double -> int
		// 15.2 -> 15
		// 10 + 15 => 25
		//����ȯ -> casting
		int result = x + (int)y;//
		
		System.out.println(x+y);//�Ǽ�
		System.out.println(result);//����
	}

}
