package ch04_array2;

public class Arry2Exam5 {
	public static void main(String[] args) {
		/// 2�����迭 - ����ǥ �ۼ�
		String title ="����ǥ";
		String[] head= {"�̸�","����","����","����","����","���"};
		System.out.println("\t\t"+title);
		for(String h:head)System.out.print(h+"\t");
		System.out.println("\n===========================================");
		String[] name = { "ȫ�浿", "������", "�Ӳ���", "�̼���" };
		int sum = 0;
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 65, 87 } };
		//
		for (int i = 0; i < score.length; i++) {// score.length-�迭�� ���� ����
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {// score[i].length =�迭�� �� ���� ���� ����
				System.out.print(score[i][j] + "\t");
				sum+=score[i][j];//�� �ະ ������ ���
			}//���� for��
			System.out.println(sum+"\t"+sum/score[i].length);
			sum=0;//�ʱ�ȭ
		}//�ٱ��� for��
		System.out.println("===========================================");
	}
}