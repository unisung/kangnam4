package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServerEX {
	public static void main(String[] args) {
      //통신에 필요한 객체 선언
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener=null;
		Socket socket=null;
		try {
			//접속 대기
			listener = new ServerSocket(9999);//
			System.out.println("연결을 기다립니다....");
			//접속
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket!=null) socket.close();
				if(listener!=null)listener.close();
			}catch(Exception e) {
				System.out.println("클라이언트와 채팅 중 오류발생!!!!");
			}
		}
		
	}
}
