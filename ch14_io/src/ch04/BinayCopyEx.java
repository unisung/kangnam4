package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//��������Ÿ�� ������ ���ϵ�(�̹���,����,����)
public class BinayCopyEx {
public static void main(String[] args) {
	File src = new File("c:\\temp\\src.png");
	File dest = new File("c:\\temp\\javasample\\dest.png");
	int c;
	try {
		  //���̳ʸ� ��Ʈ�� ����
		FileInputStream fi = new FileInputStream(src);	
		FileOutputStream fo = new FileOutputStream(dest);
		//����
		while((c=fi.read())!=-1) {
			 fo.write((byte)c);
		}
		fi.close();
		fo.close();
		System.out.println(src.getPath()+"�� "+dest.getPath()+"�� ���� �Ϸ�");
	}catch(Exception e) {
		System.out.println("���� �߻�");
	}
}
}
