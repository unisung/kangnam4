package ch01;

import java.io.FileReader;

//���Ϸ� ���� ���ڴ���(2byte)�� �����ϴ� ���(FileReader)
public class FilereaderEx {
	public static void main(String[] args) {
		//���ڴ����Է� ��Ʈ�� Reader
		FileReader fin=null;
		try {
		    fin = new FileReader("c:\\windows\\system.ini");//���丮\���ϸ�
		    int c;//���� ���ھ� ��� �����ϴ� ����
		    while((c=fin.read()) !=-1) {//read()�Լ� ���ھ� �о intŸ������ ���ϸ޼ҵ�, ����Ÿ�� ������ -1�� ����
		    	System.out.print((char)c);//���ڷ� ����ȯ �� ���
		    }
		    //�ڿ�����
		    fin.close();
		}catch(Exception e) {
			System.out.println("����� ����");
		}
	}
}