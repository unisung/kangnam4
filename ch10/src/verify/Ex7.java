package verify;

public class Ex7 {
public static void main(String[] args) {
	try {
		login("white","12345");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		login("blue","54321");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
}//main
public static void login(String id, String password)
          throws Exception{
		    //throws NotExistIDException,WronPasswordException{
	//id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
	 if(!id.equals("blue")) {
		 throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
	 }
		//password�� "12345"�� �ƴ϶�� WrongPasswordExceprion �߻���Ŵ
	 if(!password.equals("12345")) {
		 throw new WronPasswordException("�н����尡 Ʋ���ϴ�.");
	 }
 }

}
