package ch06_break;

public class Break1 {
public static void main(String[] args) {
	int num=0, sum=0;
	while(true) {
		num++;//1�� ����
		sum+=num;//�����ؼ� ���ϱ�
		if(num==50) break;//while���� ���������� ���� break;
	}
	System.out.println("�հ� :"+sum);
}
}
