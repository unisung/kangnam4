package ch02;

public class BitOperationExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     byte flag = 0b00001010; //�� ��Ʈ�� 8���� ���� ��Ʈ
     if( (flag & 0b00001000) == 0) //��Ʈ �� ���� ����� 0 ���� ��
    	 System.out.println("�µ��� 0�� ����");
     else
    	 System.out.println("�µ��� 0���̻�");
	}
}
