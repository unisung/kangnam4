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
     
     //스캐너는 enter키 값을 제거 한후 값을 리턴.
     while(run) {
    	 if(keyCode !=-1) {//
    		 System.out.println("----------------");
    		 System.out.println("1.증속 | 2. 감속 | 3. 중지:");
    		 System.out.println("----------------");
    		 System.out.println("선택: ");
    	 }
    	 keyCode = scanner.nextInt();//키보드로 부터 int타입 값 입력
    	
    	 if(keyCode==1) {//"1"
    		 speed++;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==2) {//"2"
    		 speed--;
    		 System.out.println("현재 속도="+speed);
    	 }else if(keyCode==3) {//"3"
    		 run=false;
    	 }
     }//while끝.
		System.out.println("종료");
	}
}
