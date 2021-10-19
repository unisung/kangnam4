package ch01_thread02;

//싱글쓰레드방식
public class BeepPrintExample {
	public static void main(String[] args) {
	
	 //2.상속받은 클래스생성하여 실행
	  Thread thread = new BeepTask();
	  
	  //3.생성된 thread객체의 run()메소드 실행
	  //(thread.run();//직접호출 <- 이렇게 하지않음.)
	  thread.start();
		
	 //main스레드에서 실행되는 부분
	 for(int i=0;i<5;i++) {
		 System.out.println("띵");
		 try {
			 Thread.sleep(500);//0.5초간 정지
		 }catch(Exception e) {}
	 }
	}
}
