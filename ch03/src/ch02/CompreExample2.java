package ch02;

public class CompreExample2 {
	public static void main(String[] args) {
		int age =25;
		//�ڹٿ����� ���Ұ�
		//if(20 <= age < 300){}
		
		if((age >=20) && (age < 30)) {
			System.out.println("20��");
		}
		char c = 'x'; // 'x' => ASCII�ڵ尪 ��
		if((c>='A') && (c<='Z')) {// 
			System.out.println("�����빮��");
		}
		int x=50; 	int y= 25;
		if((x>=0) && (y>=0) && (x<=50) && (y<=50)) {
			System.out.println("�������� �ִ� ��ǥ");
		}
	}
}
