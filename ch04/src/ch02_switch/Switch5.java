package ch02_switch;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
	String str ="";
	System.out.println("���� �Է��ϼ���");
	int num = scanner.nextInt();

	//��ø switch()��
	switch(num) {
 case 12: case 1: case 2: str="�ܿ�"; break;
 case 3: case 4: case 5: str="��"; break;
 case 6: case 7: case 8:
	 switch(num) {
	 case 6: str="�ʿ���";break;
	 case 7: str="��¥ ���� ����"; break;
	 case 8: str="�� ����";
	 }
	 break;
 case 9: case 10: case 11: str="����"; break;
 default: str="���� ����!!!";
	}
System.out.println("���� ������ "+str);	
	
    
	}

}
