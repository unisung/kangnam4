package exam;

/*4.while���� Math.random()�޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ ��
  ������ ���� (��1, ��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ���
  �ֻ����� ������ , ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����
  ���� ���� 5�� �Ǵ� ������ (1,4),(4,1),(2,3),(3,2)�Դϴ�. 
  x+y=5(1<=x<=6, 1<=y<=6);
  x�� 1�϶� y:1,2,3,4,5,6 - 4
  x�� 2�϶� y:1,2,3,4,5,6 - 3
  x�� 3�϶� y:1,2,3,4,5,6 - 2
  x�� 4�ϴ� y:1,2,3,4,5,6 - 1
  x�� 5�϶� y:1,2,3,4,5,6 - X
  x�� 6�϶� y:1,2,3,4,5,6 - x
 * */
public class Exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int cnt=0;
		
       while(true) {//���� �ݺ�
        i=(int)(Math.random()*6)+1;//ù��° �ֻ��� 1<=i<=6
        j=(int)(Math.random()*6)+1;//�ι�° �ֻ��� 1<=j<=6
        if(i+j==5) break;//���� �ݺ��� ���������� ����
        cnt++;
       }
       
       System.out.println("("+i+","+j+")");
	   System.out.println("�ѹݺ�Ƚ��:"+cnt);
		
	}
}
