package ch04_array2;

public class Arr1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // 1,2,3,4,5 1�����迭 - �ʱⰪ�� �˰� ������ 
		int[] arr1 = {1,2,3,4,5};
	  // 1���� 3���� 2���� �迭 ����� {1,2,3}, {4,5,6},{7,8,9}
		int[][] arr2 = {{1,2,3}, 
				        {4,5,6},
				        {7,8,9}};//3�� 3���� ������ �迭
	  // 2���� 2���� 3���� �迭 ����� 
	  //{{1,2,3}, {4,5,6},{7,8,9}},{{11,12,13}, {14,15,16},{17,18,19}}
		int[][][] arr3 = {
				          {{1,2,3}, 
			               {4,5,6},
			               {7,8,9}},
				          {{11,12,13}, 
			               {14,15,16},
			               {17,18,19}}
			               };
		//String.toString();
		//Object.toString();//CtrlŰ + ���콺Ŀ��
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
	}





}
