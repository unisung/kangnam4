package ch06;

public class StringLiteralExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     //����, �ѱ� ����
	 String str1 = "Good";
     String str2 = "Morning";
     String str3 = "�ڹ�";
     
     //������ ���ڿ�
     String str4 = "3.19";
     String str5 = "26";
     //������ ���ڿ��� ����Ÿ������ ���� ����
     int n1 = Integer.parseInt(str5);
     double d1 = Double.parseDouble(str4);
     double result = n1 + d1;
     
     System.out.println(n1);
     System.out.println(d1);
     System.out.println(result);
     
     
     //�����ϳ� ������ ���ڿ�
     String str6 = "a";
		
	}
}
