package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcCliendEx {
 public static void main(String[] args) {
  //��ſ� �ʿ���  ��ü ����
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket=null;
	Scanner scanner = new Scanner(System.in);
  try {
	  //������ ����
	  socket = new Socket("localhost",9999);
	  
	  
	  
  }catch(Exception e) {
	  System.out.println(e.getMessage());
  }finally {
	  try {
		  scanner.close();
		  if(socket!=null)socket.close();
	  }catch(Exception e) {
		  System.out.println("������ ��� �� ���� �߻�");
	  }
  }
	

	}
}
