package ch03_array;

/* �迭 ��ҵ��� Ÿ���� �⺻Ÿ�� */
public class Ex08Sort {
	public static void main(String[] args) {
		//1���� �迭�� �������� ����
		int[] score = {76,45,34,89,100,50,90,92};//34,45,50,76,89,90,92,100
		int temp=0;//�迭 ����� ���� �ӽ� ������ ����
		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i] > score[j]) {//i�� ���� ũ�� j�� ���� ��ȯ					
					temp=score[i];//i�� ���� �ӽú����� ����
					score[i]=score[j];//j�� ���� i�� ���� ��
					score[j]=temp;//�ӽ������� ���� �ٽ� j�� ����
				}
			}
		}
      //���ĵ� ���� ���
		for(int i:score) {
			System.out.print(i+"  ");
		}
	}
}
