package ch03;

import java.io.File;

//�������� Ŭ���� File
public class FileEx {
public static void main(String[] args) {
//�������� ��� File ���� =new File(���\\���ϸ�);
File f1 = new File("c:\\windows\\system.ini");
//���ϰ�� gePath(), ���丮 ��� getParent(), ���ϸ� getName()
 System.out.println(f1.getPath() +", "+f1.getParent()+", "+f1.getName());
String res="";
//�������� ���� Ȯ�� isFile()
if(f1.isFile()) res="����";
//���丮 ���� ���� Ȯ�� isDirectory()
else if(f1.isDirectory()) res="���丮";
System.out.println(f1.getPath()+"�� "+res+"�Դϴ�.");

System.out.println("----- ���丮 ���� ��� -------------");
File f2 = new File("c:\\temp\\java_sample");//���丮
//���� ���翩�� Ȯ�� exists()
if(!f2.exists()) {//���������� ������
	f2.mkdir();//���� - ���丮�� ���� mkdir() 
}
//���� ���
listDirectory(new File("c:\\temp"));

//���丮�� ���� -���ϸ� ���� rename(���ο���������);
f2.renameTo(new File("c:\\temp\\javasample"));

}
public static void listDirectory(File dir) {
	System.out.println("--------"+dir.getPath()+"�� ������丮�Դϴ�.");
	File[] subFiles = dir.listFiles();//���丮�� ���� ����Ʈ�� File�迭�� ����
	for(int i=0;i<subFiles.length;i++) {
		File f=subFiles[i];
		long t=f.lastModified();//�������Ͻø���(������ �Ͻ�), 1970,1,1,0,0,0
		System.out.print(f.getName());//���ϸ� 
		System.out.print("\t���� ũ��:"+f.length());//���ϻ�����
		System.out.printf("\t������ �ð�:%tb %td %ta %tT\n",t,t,t,t);//�� �� ���� �ð�
	}
}
}