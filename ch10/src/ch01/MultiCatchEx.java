package ch01;

public class MultiCatchEx {
	public static void main(String[] args) {
	  String[] arr= {"hello","hi","bye"};
     //�߻��ϴ� ���ܰ�ü ���� catch�� �߰�     
	  try {
		  System.out.println(arr[3]);//�ε��� ����
		  int a=Integer.parseInt("��");//������ ����
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("�ε��� ����");
	  }catch(NumberFormatException e) {
		  System.out.println("������ ����");
	  }
	  
	}
}
