package exam;

/*3. for���� �̿��ؼ� 1���� 100���� ���� �߿��� 
 *   3�� ����� ������ ���ϴ�
     �ڵ带 �ۼ��� ������.*/
public class Exam03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //�������� ���� ���� Ÿ�� ���� �����ϰ� 0���� �ʱ�ȭ
	int sum=0;
	
	for(int i=1;i<=100;i++) {
		 if(i%3==0) {// �������(�ش���� ���� �������� 0) :i%2==0, i%5==0
			 sum+=i;//sum=sum+i;
		 }
      }
	System.out.println("3�� ����� ����:"+sum);
	}
}
