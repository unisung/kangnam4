package ch01;

/* ���� ���� ����� �����ϰ� ��ü ������ ����������
 * NullPointerException���ܰ� �߻� */
public class NullPointExceptionExam {
	public static void main(String[] args) {
		//�����Ͻô� ���������� ������ �����Ƿ� ���� �߻����� ����.
	  //Ÿ��[]�� Ÿ������ �迭�� �����Ѵٴ� �ǹ�
	  int[] intArray = null;//��ü ���� ���� ���� �ϰ� ���� ��ü�� ������������.
	  //intArray=new int[10]; //�迭 ��ü ����, new Ÿ��[]�� �ڹٿ��� �迭�� �����Ѵٴ� �ǹ�.
	  intArray[0] =10;//���α׷� ������ ���� �߻�- runtime Exception
	  
	  String str=null;//��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����.
	 // str="hello";//"hello"���ڿ� ��ü ����
	  System.out.println("�� ���ڼ�:"+str.length());//���α׷� ���� �� ���� �߻�-runtime exception
		
	}
}
