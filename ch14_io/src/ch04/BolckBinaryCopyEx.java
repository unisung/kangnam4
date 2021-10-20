package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BolckBinaryCopyEx {
  public static void main(String[] args) {
	File src=new File("c:\\temp\\src.png");
	File dest=new File("c:\\temp\\javasample\\newDest.png");
	try {
		//��Ʈ��
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dest);
		//byte�迭
		byte[] buf = new byte[1024*10];//10kb ����
		while(true) {
			int n=fi.read(buf);//read(����)�� ���ϰ��� ���ۿ� �Էµ� byte������ ����
			fo.write(buf,0,n);//writer(�迭,����index,����)
			if(n<buf.length) break;//���������� ���ۿ� �� ���� ���۱��̺��� ������ ����
		}
		fi.close();
		fo.close();
		System.out.println(src.getPath()+"�� "+dest.getPath()+"�� ���� �Ϸ�");
	}catch(Exception e) {
		System.out.println("���� ���� ����");
	}
}
}
