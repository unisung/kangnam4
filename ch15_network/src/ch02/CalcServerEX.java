package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServerEX {
	public static void main(String[] args) {
      //��ſ� �ʿ��� ��ü ����
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener=null;
		Socket socket=null;
		try {
			//���� ���
			listener = new ServerSocket(9999);//
			System.out.println("������ ��ٸ��ϴ�....");
			//����
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket!=null) socket.close();
				if(listener!=null)listener.close();
			}catch(Exception e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� �����߻�!!!!");
			}
		}
		
	}
}
