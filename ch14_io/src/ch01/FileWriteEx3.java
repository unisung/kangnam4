package ch01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���ڴ���(2byte)�� ���� �����ϴ� ��Ʈ����ü ����
		FileWriter fout=null;
		int c;//
		try {
			fout = new FileWriter("c:\\temp\\test2.txt");
			System.out.println("�޼����� �Է��ϼ���>");
			while(true) {
				String line = scanner.nextLine();//�� �� ������ �Է¹ޱ�
				if(line.length()==0) break;//�����Է¾��� EnterŰ ġ�� ����������
				fout.write(line,0,line.length());//write(���ڿ�,����index,���ڿ�����);
				fout.write("\r\n",0,2);//����ڿ� ĳ���� �����߰�,write(���ڿ�,����index,���ڿ�����);
			}
			//�ڿ�����
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�ڿ�����
		scanner.close();
	}
}
