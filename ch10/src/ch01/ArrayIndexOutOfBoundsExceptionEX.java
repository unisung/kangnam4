package ch01;

public class ArrayIndexOutOfBoundsExceptionEX {
	public static void main(String[] args) {
    //�迭 ���� ���� �ε��� ������ ����� �߻��ϴ� ����
	String[] arr = {"hello","hi","bye"};
   try {	
	System.out.println(arr[0]);
	System.out.println(arr[3]);
   }catch(ArrayIndexOutOfBoundsException e) {
	   //System.out.println(e.getMessage());
	   //e.printStackTrace();//�����
	   System.out.println("index ������ ������ ��� ����");
   }

	}
}
