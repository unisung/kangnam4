package verify;

public class Ex9 {
	public static void main(String[] args) {
		System.out.println("���� �ڵ�� 1���� 100������ ������ �� ���ڿ��� ����� ���ؼ� += �����ڸ� �̿��ؼ� 100��\r\n"
				+ "�ݺ��ϰ� �ֽ��ϴ�. �̰��� �� 100�� �̻��� String ��ü�� �����ϴ� ����� ����� ������ ���� ��\r\n"
				+ "���� �� �� �����ϴ�. StringBuilder�� ����ؼ� �� �� ȿ������ �ڵ�� �������Ѻ�����.");
     
		 String str="";
		 for(int i=1;i<=100;i++) str+=i;
		 System.out.println(str);
		 
		 //���� �ڵ�
		 StringBuilder sb = new StringBuilder();
		 for(int i=1;i<=100;i++) sb.append(i);
		 
		 str=sb.toString();
		 System.out.println(str);
		
	}
}
