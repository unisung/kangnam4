package NaNAndInfinity;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   int x = 5;
   double y = 0.0;//�Ǽ� ���� 0�� ����� �Ǽ�
   int i = 0;
   
   double z = x/y;//��
   double z1 = x%y;//������
		
   System.out.println(Double.isInfinite(z));//�Ǽ��� ���� �������� infinity���� ���� Ȯ��
   System.out.println(Double.isNaN(z1));//�Ǽ��� ������ ���� ����� ���ڷ� ǥ�� �Ұ����� üũ
   
   System.out.println(z+2);// �𷡻��忡 �� ���� ���ϸ� �𷡻���
   System.out.println(z1+2);//���ڰ� �ƴѰſ� ���� ���ϸ� ����� ���ڰ� �ƴ�
   
   /* ����(����) ó�� ���� */
   try {
   System.out.println(x/i);// ���� �߻� / 0
   }catch(Exception e) {
	   System.out.println("���� 0���� ������ ���� �߻�");
   }	
	}
}
