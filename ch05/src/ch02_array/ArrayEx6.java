package ch02_array;

public class ArrayEx6 {
public static void main(String[] args) {
	//�迭����
	//Ÿ�� ������[];
	//������ =new Ÿ��[]{�ʱⰪ1,�ʱⰪ2,�ʱⰪ3,...};
	int scores[]=null;
	//�迭 ���� ���� ������ ���߿� �ʱⰪ���� �迭�����ô� new Ÿ��[]�� {}�տ� �ٿ������. 
	scores=new int[]{10,15,5,7,8,3,9,10,5,4};
	
	System.out.println(scores.length);
	
	int sum=0;

	for(int i=0;i<scores.length;i++) {
		 sum=sum+scores[i];// �迭�� ����� ��� ���� - �迭������[index��ȣ] 
	}
	
	double avg = sum/(double)scores.length;
	System.out.println("avg:"+avg);

}
}
