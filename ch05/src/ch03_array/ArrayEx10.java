package ch03_array;

public class ArrayEx10 {
	public static void main(String[] args) {
		//�� �迭�� �ʱⰪ�� �ش� Ÿ���� �⺻��
		byte[] arrB = new byte[5];
		arrB[0]=0; arrB[1]=0;arrB[2]=0;arrB[3]=0;arrB[4]=0;
		for(int i=0;i<arrB.length;i++) {
			System.out.print(10+arrB[i]+"\t");
		}
		System.out.println();
		char[] charA = new char[5];
		for(int i=0;i<charA.length;i++) {
			System.out.print(charA[i]+"\t");
		}
		System.out.println();
		short[] shortA = new short[5];
		for(int i=0;i<shortA.length;i++) {
			System.out.print(shortA[i]+"\t");
		}
		System.out.println();
		int[] intA = new int[5];
		for(int i=0;i<intA.length;i++) {
			System.out.print(10+intA[i]+"\t");
		}
		System.out.println();
		long[] longA = new long[5];
		for(int i=0;i<longA.length;i++) {
			System.out.print(longA[i]+"\t");
		}
		System.out.println();
		System.out.println("�Ǽ��迭");
		float[] floatA = new float[5];
		for(int i=0;i<floatA.length;i++) {
			System.out.print(floatA[i]+"\t");
		}
		System.out.println();
		double[] doubleA = new double[5];
		for(int i=0;i<doubleA.length;i++) {
			System.out.print(10+doubleA[i]+"\t");
		}
		System.out.println();
		System.out.println("�����迭");
		
		//�迭 ������ �ش�Ÿ���� �ʱⰪ���� �ʱ�ȭ��.
		//�⺻Ÿ���� 0�̳�, 0.0, ' '�� �ʱ�ȭ�Ǿ ���� �ʱ�ȭ �۾� ���̵� ���깮������.
		//����Ÿ���� �迭������ �� ����� ���� null�� �Ǿ�����.
		//����ҿ� �ش��ϴ� ��ü�� �������� �ʰ� �ִ� ��.
		//�� ��ҿ� ���ٽ� NullPointerException�߻���.
		//null�� �ƴ� �ٸ� ������ �ʱ�ȭ�� ���־����.
		String[] stringA = new String[5];
		stringA[0]="a";
		stringA[1]="b";
		stringA[2]="c";
		stringA[3]="d";
		stringA[4]="e";
		for(int i=0;i<stringA.length;i++) {
			System.out.print(stringA[i].length()+"\t");
		}
		
		
	}

}
