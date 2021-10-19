package ch01;

import java.awt.Toolkit;
//싱글쓰레드방식
public class BeepPrintExample {
	public static void main(String[] args) {
	  //beep음 출력용객체 생성
	 Toolkit toolkit = Toolkit.getDefaultToolkit();//
	 for(int i=0;i<5;i++) {
		 toolkit.beep();
		 try {
			 Thread.sleep(500);//0.5초간 정지
		 }catch(Exception e) {}
	 }
	 
	 for(int i=0;i<5;i++) {
		 System.out.println("띵");
		 try {
			 Thread.sleep(500);//0.5초간 정지
		 }catch(Exception e) {}
	 }
	}
}
