package ch03_array;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //1���� �迭�� ����
	 int[] intArr1= {1,2,3,4,5};
	 //���ο� �������� ���� intArr1�� �迭�� ������ ����
	 //���: intArr1�� �����ϴ� �ּҰ��� �����Ͽ�����
	 int[] intArr2=intArr1;//intArr2���� intArr1�� �ּҰ��� ���޵�.
	 
	 for(int a:intArr1)
		 System.out.print(a+" ");
	System.out.println();
	  for(int b:intArr2)
		 System.out.print(b+" ");
	  
	 System.out.println();
	 System.out.println("-----------------");
	  //intArr2�� index��ȣ 3�� �ش��ϴ� ��ġ�� �� ����
	  intArr2[3]=10;
	  for(int a:intArr1)
			 System.out.print(a+" ");
		System.out.println();
	  for(int b:intArr2)
			 System.out.print(b+" ");
	  
	
	 
		
	}
}
