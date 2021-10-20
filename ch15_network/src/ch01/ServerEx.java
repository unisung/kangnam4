package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out =null;
		ServerSocket listener =null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			
		}catch(Exception e) {
			
		}finally {
			try {
				scanner.close(); socket.close(); listener.close();
			}catch(Exception e) {
				System.out.println("클라이언트와 채팅 중 오류 발생");
			}
		}
		
		
	}

}
