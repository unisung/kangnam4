package ch02_String02;

public class StringBuilderEx2 {
	public static void main(String[] args) {
		//
	StringBuffer sb = new StringBuffer();
	
	 //���ڿ� �̾���� append()
	 sb.append("Java ");
	 sb.append("Programming study");
	 //
	 System.out.println(sb);//toString()�������
	 
	 //���� insert(index,���ڿ�)
	 sb.insert(4, "2");
	 System.out.println(sb);//toString()�������
	 //setCharAt(index,�ٲܹ���)
	 sb.setCharAt(4, '6');
	 System.out.println(sb);//toString()�������
	 
	 //replace(����index,��index,�ٲܹ��ڿ�);  ����index��ȣ<=����<��index
	 sb.replace(6, 13, "Book");
	 System.out.println(sb);//toString()�������
	 
	 // delete(����index,��index); ����index <=���� < ��index
	 sb.delete(4,5);
	 System.out.println(sb);//toString()�������
	 
	 int length = sb.length();
	 System.out.println("�� ���ڼ�:"+length);
	 
	 //
    String result = sb.toString();//���۳����� ����
    System.out.println(result);
	 
	}

}
