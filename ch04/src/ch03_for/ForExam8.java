package ch03_for;

public class ForExam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ʱ�ȭ �κ��̳� �����κп� ,�� ��ɹ��� �����Ҽ� ����.
	  for(int i=1, y=1; i < 10 ;i++ , System.out.println(y) ) {//
		  System.out.println("hello");
		  //for���� ���������� ������ �������� ó��{}
		  if(i==10) break;//���� ���������� ��ɹ� break;
		  y++;
	  }
	     System.out.println("����");
	}
}
