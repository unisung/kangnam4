package ch04_array2;

/*
 * 2�� 3���� 2���� �迭 ����
 * 1,2,3,4,5,6
 * 1,2,3
 * 4,5,6
 * */
public class Array2Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] scores = new int[2][3];
       scores[0][0]=1; scores[0][1]=2; scores[0][2]=3;
       scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
       
       //2�������� lenght�� ���� 1���� �迭�� ���� �ǹ�
       System.out.println("1�����迭�� ����:"+scores.length);//2
       
       System.out.println("�� 1�����迭�� ����Ǽ�:"+scores[0].length);
       System.out.println("�� 1�����迭�� ����Ǽ�:"+scores[1].length);
       
       //���
       for(int i=0;i<scores.length;i++) {//1���� ���� ���� 
    	   for(int j=0;j<scores[i].length;j++) {//�� ���� 1���� �迭�� ��Ҽ�
    	   System.out.print(scores[i][j]+" ");
    	   } 
    	   System.out.println();
       }
       
       //����
       //���� for���� �̿��Ͽ� 2���� �迭�� ��ҵ��� ��� ����ϼ���.
       // int -> int[] -> int[][](->int[][][])
       for(int[] s1:scores) {
    	   for(int s:s1) {
    		   System.out.print(s+" ");
    	   }
    	   System.out.println();
       }
       
		
	}
}
