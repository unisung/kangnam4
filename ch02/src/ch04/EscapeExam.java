package ch04;

public class EscapeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//escape����-
		//�������ڷ� ǥ�õ����ʰ� \�� �����ؼ� Ư�� ����� �ϴ� ���ڵ�
		String message ="hello\n my \t name is \"ȫ�浿\",\n my favorite \'toys\', ���丮 c:\\temp";
        System.out.println(message);
        
        String message2 ="hello n my t name is \"ȫ�浿\",n my favorite 'toys', ���丮 c:\temp";
        System.out.println(message2);
	}

}
