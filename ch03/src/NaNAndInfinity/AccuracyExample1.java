package NaNAndInfinity;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple =1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		//System.out.printf("%f\n", number*pieceUnit);
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result+"������ ���´�.");

		// ������ ��Ȯ�� ���� ����ϰ�
		// 1 * 10 => ���� 
		int totalPieces = apple * 10;
		// 10 -7 = 3 => ����
		int temp = totalPieces - number;
		
		//�Ǽ����·� ��ȯó��
		// 3/10.0 => 3.0
		 result = temp/10.0;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result+"������ ���´�.");
		
		
		
	}
}
