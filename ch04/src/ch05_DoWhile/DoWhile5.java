package ch05_DoWhile;

import java.util.Scanner;

public class DoWhile5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int ran = (int)(Math.random()*100)+1;//���� ���ǰ� ����
      int cnt =1;
      do {
    	  System.out.println("1����100������ ���� �Է�!");
    	  int num = scanner.nextInt();
    	  if(num ==ran) {
    		  System.out.println("����!"+cnt+"�� ���� ������ϴ�.");
    		  break;//break���� ���ΰ� �ִ� �ݺ��� ���� ����� ��ɹ�;
    	  }else if(num > ran) {
    		  System.out.println("�Էµȼ��ڰ� ���Ҽ��ں��� Ů�ϴ�.");
    	  }else {
    		  System.out.println("�Էµȼ��ڰ� ���Ҽ��ں��� �۽��ϴ�.");
    	  }
    	  cnt++;
      }while(true);//���� �ݺ�
	}
}