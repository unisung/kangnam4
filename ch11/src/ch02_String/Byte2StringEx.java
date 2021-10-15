package ch02_String;

import java.io.UnsupportedEncodingException;

public class Byte2StringEx {
	public static void main(String[] args) 
			    throws UnsupportedEncodingException {
	  byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};
	  
	  //byte�迭�� String��ü ����
	  String str1 = new String(bytes);

	  System.out.println(str1);
	  
	  //byte�迭,����index,����
	  String str2 = new String(bytes,6,3);
	  System.out.println(str2);
	  
	  //String���� ���� byte�迭 ����
	  byte[] bytes2 = "ȫ�浿".getBytes();//[][] [][] [][]-EUC-KR
	  
	  System.out.println(bytes2.length);
	  /*
	  for(int i=0;i<bytes2.length;i++) {
		  System.out.println((int)bytes2[i]);
	  }
	  */
	  //String str3=new String(bytes2,"UTF-8");//[][][] [][][]-3BYTE
	  String str3=new String(bytes2,"EUC-KR");//[][] [][] [][]-2BYTE
	  System.out.println(str3);
	  
	}
}
