package ch02_String02;

import java.util.StringTokenizer;

public class StringTokenizer01Ex {
	public static void main(String[] args) {
		String text ="ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text,"/");//(text,������)
		
		//���� ����� ��ū��
		System.out.println(st.countTokens());
		//����
		while(st.hasMoreTokens()) {//���� ��ū�� �ִ��� Ȯ��
			String token=st.nextToken();//��ū ����
			System.out.println(token);
			System.out.println(st.countTokens());//���� ��ū��
		}
	}
}
