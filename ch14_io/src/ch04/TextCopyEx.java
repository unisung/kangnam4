package ch04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//�������� ���� Reader/Writer
public class TextCopyEx {
public static void main(String[] args) {
	//��������
	File src=new File("c:\\windows\\system.ini");//���� ����
	File dest =new File("c:\\temp\\system.txt");//�������� ��θ�
	
	int c;//read()�޼ҵ��� ���� Ÿ�� int
	try {
		//��Ʈ�� ���� - ���ڴ���
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		while((c=fr.read())!=-1) {//�����ϳ� �а�,
		       fw.write((char)c); //�����ϳ� ����
		}
		fr.close(); fw.close();
		System.out.println(src.getPath()+"�� "+dest.getPath()+"�� ���� �Ϸ�");
	}catch(Exception e) {
		System.out.println("���� ���� �߻�");
		e.printStackTrace();
	}
}
}
