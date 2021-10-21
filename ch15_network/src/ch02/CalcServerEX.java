package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

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
			//��Ʈ�� ���
			in
			=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out
			=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//����
			while(true) {
				
			}
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
	}//���� �޼ҵ�()��.
	//���� ó�� �޼ҵ�
	public static String calc(String exp) {
		//"43 + 30" => "43","+","30"
		//���޵� �޼����� ���� ��ū(��ȿ�� ��) �и�
		StringTokenizer st
		=new StringTokenizer(exp," ");//new StringTokenizer(���ڿ�,������);
		if(st.countTokens()!=3) return "error";
		String res="";//������ ���� ��ü(���ڿ�)->stream -> Ŭ���̾�Ʈ ���ڿ��� ���� 
		int op1 = Integer.parseInt(st.nextToken());//ù ��° ��ū "43"
		String opcode = st.nextToken();//�� ��° ��ū "+"
		int op2 = Integer.parseInt(st.nextToken());// �� ��° ��ū "30"
		//����ó��
		switch(opcode) {
		case "+": res =Integer.toString(op1 + op2); break;//
		case "-": res =Integer.toString(op1 - op2); break;
		case "*": res =Integer.toString(op1 * op2); break;
		default: res="error";
		}
		return res;
	}
	
}
