package ch03_array;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//���� for���� �̿��Ͽ�
		//�հ� ��� ���
		double total=0;
		for(int i=0;i<scores.length;i++)
			total+=scores[i];
		total=0;
		
		for(double k:scores) {
			total+=k;
		}
		System.out.printf("�հ�:%.2f\n",total);
		//System.out.println((int)(total*100)/100.0);
		System.out.println("�հ�:"+((int)(total*100)/100.0));
		
		double avg=total/(double)scores.length;
		//�Ҽ��� �ڸ��� printf("%.ǥ���ҼҼ��� �ڸ���f",��);
		System.out.printf("%.3f",avg );

	}

}
