package ch06_methods;

public class Computer {
 int sum1(int[] values) {
	 int sum=0;
	 for(int i=0;i<values.length;i++) {
		 sum+=values[i];
	 }
	 return sum;
 }
  //�ڹ� 1.5���� ����
 //���޵Ǵ� �Ű������� ������ �� ��� �Ű������� (Ÿ�� ... ����)�� ����
 int sum2(int ... values) {//�迭�� �����Ǿ� ���޵�.
	 int sum=0;
	 for(int i=0;i<values.length;i++) {
		 sum+=values[i];
	 }
	 return sum;
 }

}
