package ch02;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class ch03 {
public static void main(String[] args) {
	FileReader fin=null;
	int c;
	try {
		fin = new FileReader("c:\\temp\\test2.txt");
		BufferedOutputStream out = new BufferedOutputStream(System.out,5);//����ũ�� 5�� ���� ��Ʈ��
		while((c=fin.read())!=-1) {
			out.write(c);
		}
		//
		new Scanner(System.in).nextLine();
		out.flush();//���ۿ� �����ִ� ���� ��� �о��
		fin.close();
		out.close();
	}catch(Exception e) {
	}
}
}
