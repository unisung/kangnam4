package ch01;

public class MultiCatchEx2 {
	public static void main(String[] args) {
	  String[] arr= {"hello","hi","bye"};
     //�߻��ϴ� ���ܰ�ü���� ���� ������ ��� | �� �����Ͽ� ��밡�� 
	  try {
		  System.out.println(arr[3]);//�ε��� ����
		  int a=Integer.parseInt("��");//������ ����
	  }catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
		  System.out.println("�ε����� ������ ����");
	  }
	  
	}
}
