package ch01;

public class MultiCatchEx4 {
	public static void main(String[] args) {
	  String[] arr= {"hello","hi","bye"};
	  String str=null;
     //�߻��ϴ� ���ܰ�ü���� ���� ������ ��� | �� �����Ͽ� ��밡�� 
	  try {
		  System.out.println(arr[3]);//�ε��� ����
		  int a=Integer.parseInt("��");//������ ����
		  System.out.println(str.toString());//null ����
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("�ε��� ����");
	  }catch(NumberFormatException e) {
		  System.out.println("������ ����");
	  }catch(Exception e) {//���� ���� ���ܰ� �Ʒ��� �;� ��.
		  System.out.println("�ٸ� ����");
	  }
	  
	}
}
