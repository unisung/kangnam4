package verify;

import java.util.StringTokenizer;

public class Ex8 {
public static void main(String[] args) {
	System.out.println("8.���� ���ڿ����� ��ǥ(,)�� ���еǾ� �ִ� ���ڿ��� "
			 + "String�� split() �޼ҵ� �Ǵ� StringTokenizer�� �̿��ؼ� �и��غ�����.");
	String str = "���̵�,�̸�,�н�����";
	//���1 split()�̿�
	 String[] tokens = str.split(",");
	 for(String s:tokens)
		 System.out.print(s+" ");
	 
	 System.out.println();
	
	//���2 StringTokenizer �̿�
	 StringTokenizer stk = new StringTokenizer(str,",");
	 while(stk.hasMoreElements()) {
		 System.out.print(stk.nextElement()+" ");
	 }
}
}
