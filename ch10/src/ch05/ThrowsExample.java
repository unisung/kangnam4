package ch05;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("Ŭ���� ����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main()��.
	
	//�����Ͽ���
	public static void findClass() throws ClassNotFoundException {
		//Class - Ŭ������ ����(��Ÿ)�� ��� Ŭ����
		//forName(���ڿ�Ŭ�������) -> Ŭ���� ���� ���
		Class clazz = Class.forName("java.lang.String2");
		
	}
}