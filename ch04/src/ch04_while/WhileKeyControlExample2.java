package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     boolean run = true;
     int speed =0;
     int keyCode =0;
     
     while(run) {
    	 if(keyCode !=13 && keyCode!=10) {//EnterŰ�� �ƴϸ�
    		 System.out.println("----------------");
    		 System.out.println("1.���� | 2. ���� | 3. ����:");
    		 System.out.println("----------------");
    		 System.out.println("����: ");
    	 }
    	 //'0'�� int���� 48 49-48=1, 50-48=2, 51-48=3
    	 keyCode = System.in.read()-'0';//Ű����� ���� �Է�
    	 System.in.read();//\r =13
    	 System.in.read();//\n =10
    	 
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
