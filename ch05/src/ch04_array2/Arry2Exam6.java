package ch04_array2;

public class Arry2Exam6 {
	public static void main(String[] args) {
		/// 2�����迭 - ����ǥ �ۼ�
		String title ="����ǥ";
		String[] head= {"�̸�","����","����","����","����","���"};
		System.out.println("\t\t"+title);
		for(String h:head)System.out.print(h+"\t");
		System.out.println("\n===========================================");
		String[] name = { "ȫ�浿", "������", "�Ӳ���", "�̼���" };
		int sum = 0;
		int[] tot = new int[4];//�� ���� �� ���� �� �����ؼ� �����ϱ� ���� ����
		//int avg=0;
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 65, 87 } };
		//
		for (int i = 0; i < score.length; i++) {// score.length-�迭�� ���� ����
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {// score[i].length =�迭�� �� ���� ���� ����
				System.out.print(score[i][j] + "\t");
				sum+=score[i][j];//�� �ະ ������ ���
				tot[j]+=score[i][j];//�� ���� ������ ���[��0+��1+��2+��3][��0+��1+��2+��3][��][]
			}//���� for��
			System.out.println(sum+"\t"+sum/score[i].length);
			tot[tot.length-1]+=sum;//tot�������� sum�� ����
			//tot[tot.length-1]+=avg;
			sum=0;//�ʱ�ȭ
			//avg=0;
		}//�ٱ��� for��
		System.out.println("===========================================");
		//�� ���� �հ� ���ϱ�
		System.out.print("�� ��\t");
		for(int i=0;i<tot.length;i++) {
			System.out.print(tot[i]+"\t");
		}
		System.out.println("\n===========================================");
	}
}