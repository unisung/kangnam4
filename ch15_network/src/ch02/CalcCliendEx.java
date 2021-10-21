package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcCliendEx {
 public static void main(String[] args) {
  //통신에 필요한  객체 선언
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket=null;
	Scanner scanner = new Scanner(System.in);
  try {
	  //서버와 연결
	  socket = new Socket("localhost",9999);
	  
	  
	  
  }catch(Exception e) {
	  System.out.println(e.getMessage());
  }finally {
	  try {
		  scanner.close();
		  if(socket!=null)socket.close();
	  }catch(Exception e) {
		  System.out.println("서버와 통신 중 오류 발생");
	  }
  }
	

	}
}
