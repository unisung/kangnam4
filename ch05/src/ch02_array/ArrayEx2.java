package ch02_array;

public class ArrayEx2 {
public static void main(String[] args) {
	//�迭����
	//Ÿ��[] ������=new Ÿ��[�����ҿ������];
	int[] scores=new int[10];
	
	//����Ÿ���� ���� ������� �����ؼ� �����.
	//�迭�� index������ 0����
	scores[0]=10;
	scores[1]=15;
	scores[2]=5;
	scores[3]=7;
	scores[4]=8;
	scores[5]=3;
	scores[6]=9;
	scores[7]=10;
	scores[8]=5;
	scores[9]=4;//�迭�� �������� �������� ���� -1 ���� index��ȣ
	
	int sum=0;
	
	for(int i=0;i<10;i++) {
		 sum=sum+scores[i];// �迭�� ����� ��� ���� - �迭������[index��ȣ] 
	}
	
	double avg = sum/(double)10;
	System.out.println("avg:"+avg);

}
}
