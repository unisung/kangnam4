package ch04_array2;

/*
 * 2�� 3���� 2���� �迭 ����
 * 1,2,3,4,5,6
 * 1,2,3
 * 4,5,6
 * */
public class Array2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] scores = new int[2][3];
       scores[0][0]=1;scores[0][1]=2;scores[0][2]=3;
       scores[1][0]=4;scores[1][1]=5;scores[1][2]=6;
       
       //2�������� lenght�� ���� 1���� �迭�� ���� �ǹ�
       System.out.println("1�����迭�� ����:"
            +scores.length);//2
       
       //���
       for(int i=0;i<scores.length;i++) {
    	   System.out.print(scores[i][0]+" ");
    	   System.out.print(scores[i][1]+" ");
    	   System.out.println(scores[i][2]+" ");
       }
       
       
       
		
	}
}
