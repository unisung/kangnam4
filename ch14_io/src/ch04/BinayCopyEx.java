package ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//이진데이타로 구성된 파일들(이미지,영상,사운드)
public class BinayCopyEx {
public static void main(String[] args) {
	File src = new File("c:\\temp\\src.png");
	File dest = new File("c:\\temp\\javasample\\dest.png");
	int c;
	try {
		  //바이너리 스트림 생성
		FileInputStream fi = new FileInputStream(src);	
		FileOutputStream fo = new FileOutputStream(dest);
		//복사
		while((c=fi.read())!=-1) {
			 fo.write((byte)c);
		}
		fi.close();
		fo.close();
		System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사 완료");
	}catch(Exception e) {
		System.out.println("오류 발생");
	}
}
}
