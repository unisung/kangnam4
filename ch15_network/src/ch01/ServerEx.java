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
			//���� ���� ����
			listener = new ServerSocket(9999);//
			System.out.println("������ ��ٸ��� �ֽ��ϴ�....");
			socket =listener.accept(); 
			System.out.println("����Ǿ����ϴ�.");
			
		}catch(Exception e) {
			
		}finally {
			try {
				scanner.close(); socket.close(); listener.close();
			}catch(Exception e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�");
			}
		}
		
		
	}

}
