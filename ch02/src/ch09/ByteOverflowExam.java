package ch09;

public class ByteOverflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte�� ǥ�������� -128~127 ���� �� ����Ŭ����. 
		for(int i=-128;i<=228;i++) {
			System.out.println(i+":"+(byte)i);
		}

	}

}
