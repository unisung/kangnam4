package ch02_array;

public class ArrayEx5 {
public static void main(String[] args) {
	//�迭����
	//Ÿ�� ������[]={�ʱⰪ1,�ʱⰪ2,�ʱⰪ3,...};
	//�迭�� ������ ������ �ʱⰪ�� �˰� ���� ���� �ʱⰪ���� �迭�� �ٷ� �ʱ�ȭ�ϸ鼭 ��������.
	// ������ scores.length�� {}�� ����� ������ �ʱ�ȭ��.
	int scores[]= {10,15,5,7,8,3,9,10,5,4};
	
	System.out.println(scores.length);
	
	int sum=0;

	for(int i=0;i<scores.length;i++) {
		 sum=sum+scores[i];// �迭�� ����� ��� ���� - �迭������[index��ȣ] 
	}
	
	double avg = sum/(double)scores.lengt;
	System.out.println("avg:"+avg);

}
}
