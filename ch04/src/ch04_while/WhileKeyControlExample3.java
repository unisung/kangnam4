package ch04_while;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     boolean run = true;
     int speed =0;
     int keyCode =0;
     Scanner scanner = new Scanner(System.in);
     
     //��ĳ�ʴ� enterŰ ���� ���� ���� ���� ����.
     while(run) {
    	 if(keyCode !=-1) {//
    		 System.out.println("----------------");
    		 System.out.println("1.���� | 2. ���� | 3. ����:");
    		 System.out.println("----------------");
    		 System.out.println("����: ");
    	 }
    	 keyCode = scanner.nextInt();//Ű����� ���� intŸ�� �� �Է�
    	
    	 if(keyCode==1) {//"1"
    		 speed++;
    		 System.out.println("���� �ӵ�="+speed);
    	 }else if(keyCode==2) {//"2"
    		 speed--;
    		 System.out.println("���� �ӵ�="+speed);
    	 }else if(keyCode==3) {//"3"
    		 run=false;
    	 }
     }//while��.
		System.out.println("����");
	}
}
