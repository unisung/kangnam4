package ch06_methods_ValuePaasingVs_ReferencePassig_02;

public class ArrayPassing {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5}; //[1][2][3][4][5]
		
		//�迭�� ��ü - �����ּҰ��� �Ű����� ������ ���� ��.
		increase(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}//main()��.
	
	//�迭�� �Ű������� ���޵ȴٴ� ���� �����ϴ� �ּҰ��� ���޵ȴٴ� ��.
	static void increase(int[] array) {
		for(int i=0;i<array.length;i++) {//[2][3][4][5][6]
			array[i]++;// int x=array[i]; x++; array[i]=x;//�� ����� ����� ���� 1�� ���� 
		}
	}
}
