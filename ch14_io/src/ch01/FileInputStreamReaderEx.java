package ch01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		//���Ϸκ��� 1byte������ ���� �о���̴� ���(��Ʈ��)
		FileInputStream fin=new FileInputStream("c:\\temp\\hangul.txt");
		//1byte��Ʈ���� 2byte���ڽ�Ʈ������ ��ȯ��ü
		InputStreamReader in = new InputStreamReader(fin,"UTF-8");
		int c;
		//2byte ���ڽ�Ʈ������ ���� ���� �о ���
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
	}
}