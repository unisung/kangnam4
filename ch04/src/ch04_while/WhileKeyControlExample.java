package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     boolean run = true;
     int speed =0;
     int keyCode =0;
     
     while(run) {
    	 if(keyCode !=13 && keyCode!=10) {//Enter키가 아니면
    		 System.out.println("----------------");
    		 System.out.println("1.증속 | 2. 감속 | 3. 중지:");
    		 System.out.println("----------------");
    		 System.out.println("선택: ");
    	 }
    	 keyCode = System.in.read();//키보드로 부터 입력
    	 if(keyCode==49) {//"1"
    		 speed++;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==50) {//"2"
    		 speed--;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==51) {//"3"
    		 run=false;
    	 }
     }//while끝.
		System.out.println("종료");
	}
}
