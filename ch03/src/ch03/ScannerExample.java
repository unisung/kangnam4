package ch03;

import java.util.Scanner;//ctrl + shitf + o

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //��ĳ�� ��ü ����	
     Scanner scanner = new Scanner(System.in);
     System.out.println("�Է�:");
     //��ĳ�ʴ� �� �Է� �� EnterŰ�� ġ��  �������� \r\n�� ���� �� input������ ������.
	 String input = scanner.next();
	 //Ÿ�Ժ�ȯ ���� ���ڿ� ���·� ���
     System.out.println(input);
	}

}
