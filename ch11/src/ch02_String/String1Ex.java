package ch02_String;

public class String1Ex {
	public static void main(String[] args) {
	  String ssn="010624-1230123";
	 //���ڿ� ���� "����"�� ��ġ index��
	  int index =ssn.indexOf("-");
	  System.out.println(index);
	  
	  //��ġ index���� �ش��ϴ� �����ϳ� ���� charAt(index��ȣ);
	  char gender = ssn.charAt(index+1);
	  
	  switch(gender) {
	  case '1':
	  case '3': System.out.println("��"); break;
	  case '2':
	  case '4': System.out.println("��");
	  }
	 //���ڿ��� ���� - length
	  char[] chars = new char[ssn.length()];
	  for(int i=0;i<chars.length;i++)
		  chars[i]=ssn.charAt(i);
	  
	  for(int i=0;i<chars.length;i++)
	   System.out.print(chars[i]);
	}
}
