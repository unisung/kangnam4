package ch01;

public interface NullPointerExceptionEx {
	public static void main(String[] args) {
	//����� ���� ������ ��ü�� �������� ������ NullPointerException�߻� 
	//String str=null;
	//System.out.println(str.toString());
	String str=null;
	//���� ó�� ���� try{}catch(){}�� �ۼ�
	try {
		//���ܹ߻� ������ ��ɹ�
		System.out.println(str.toString());
	}catch(NullPointerException e) {//try{}������ �߻��� ���ܴ� catch(){}������ ó��
		//���� ó�� ��
		System.out.println(e.toString());//�߻��� ������ ������� toString();
		//������ ���� �޽��� ���
		e.printStackTrace();
	}
}
}
