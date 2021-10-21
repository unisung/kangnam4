package ch02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
	//��Ʈ�� ���
		in
		=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out
		=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	//���� ��û
	while(true) {
		System.out.println("����(��ĭ���� ��� �Է�,��:24 + 42)>>");
		String outputMessage = scanner.nextLine();//Ű���忡�� ���� �б�
		if("bye".equalsIgnoreCase(outputMessage)) {
			out.write(outputMessage+"\n");//"bye"����
			out.flush();//////// ����Ÿ �о��
			break;//����
		}
		//��������
		out.write(outputMessage+"\n");
		out.flush();
		//��� �ޱ�
		String inputMessage =in.readLine();//�����κ��� ����� �� �پ� ����
		System.out.println("��� ���:"+inputMessage);
	}
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
