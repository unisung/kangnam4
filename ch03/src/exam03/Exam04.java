package exam03;

/* 534�ڷ��� ���� 30���� �Ȱ��� ��������. ��, ������ */
public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		//�л� �Ѹ��� ������ ���� ��
		int pencilPerStudent = pencils/students;//����/����=���� ��
		System.out.println(pencilPerStudent);
		
		//���� ���� ��
		int pencilsLeft =pencils % students;//����%���� =���� ������
		System.out.println(pencilsLeft);		
		
	}
}
