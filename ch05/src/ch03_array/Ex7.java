package ch03_array;

public class Ex7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1���� �迭�� �ִ밪 �ּҰ� ���ϱ�
		int[] score = {76,45,34,89,100,50,90,92};
		//max������ �迭�� ���� ���� �����ϰ� ������ �����Ͽ� ����
		//min������ �迭�� ���� ���� �����ϱ� ū �� �����Ͽ� ����
		int sum=0, max=0, min=100;
		
		//���� for������ �����ؼ� �ִ밪, �ּҰ�, �հ�,����� ����Ͻÿ�. 
		for(int k:score) {
			sum+=k;
			if(max < k ) max=k;//max�� ���� score���� ũ�� ��ȯ
		}
		System.out.println("�ִ밪:"+max);
		
		for(int j:score) {
			if(min >j) min=j;//min�� ���� score���� ������ ��ȯ
		}
		System.out.println("�ּҰ�:"+min);
		
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+sum/(double)score.length);
	}
}
