package exam;

import java.util.Scanner;

/*
 * 7.while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� 
 * ����,���,��ȸ,���� ����� �����ϴ� �ڵ带 �ۼ��غ����� , 
  �� ���α׷��� �����Ű�� ������ ���� ���� ����� ���;� �մϴ�.
------------------------
1.����| 2.���|3.�ܰ�|4.����
------------------------
����> 1
���ݾ�>10000 // balance+=10000;
------------------------
1.����| 2.���|3.�ܰ�|4.����
------------------------
����> 2
��ݾ�>2000 // balance-=2000;
------------------------
1.����| 2.���|3.�ܰ�|4.����
------------------------
����> 3
�ܰ�>8000  // print(balance);
------------------------
1.����| 2.���|3.�ܰ�|4.����
------------------------
����> 4   
���α׷� ����  // run=!run;
 * */
public class Exam8 {
	public static void main(String[] args) {
	  //�ݺ�ó���� ���ǹ�Ȯ�� ����
	  boolean run=true;//
	  //����ݾ� ����
	  int balance = 0;
	  Scanner scanner = new Scanner(System.in);
	  //
	  while(run) {
		 System.out.println("--------------");
		 System.out.println("1.����| 2.���|3.�ܰ�|4.����");
		 System.out.println("--------------");
		 System.out.println("����>");
		 
		 int menu = scanner.nextInt();
		 switch (menu) {
		case 1:
			 System.out.print("���ݾ�>");
			 balance += scanner.nextInt();
			   break;
		case 2:
			System.out.print("��ݾ�>");
			 balance -= scanner.nextInt();
			break;	
		case 3:
			System.out.println("�ܰ�>"+balance);
			break;
		case 4:  run = !run;
			break;
		default: System.out.print("�Ŵ���ȣ�� Ȯ���ϼ���");
		 }//switch��.
	  }//while��.
      System.out.println("���α׷� ����");
	}
}
