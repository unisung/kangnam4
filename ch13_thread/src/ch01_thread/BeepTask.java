package ch01_thread;

import java.awt.Toolkit;

//1. Runnable�������̽��� Ŭ���� ����
//ThreadŬ������ �ƴϰ�
//run()�޼ҵ带 �����Ҽ� �ִ� ����� ���� Ŭ����
public class BeepTask extends Parent implements Runnable {
	@Override
	public void run() {
		  //beep�� ��¿밴ü ����
		 Toolkit toolkit = Toolkit.getDefaultToolkit();//
		 for(int i=0;i<5;i++) {
			 toolkit.beep();
			 try {
				 Thread.sleep(500);//0.5�ʰ� ����
			 }catch(Exception e) {}
		 }		
	}
}

class Parent{}