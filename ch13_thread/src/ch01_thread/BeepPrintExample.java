package ch01_thread;

//싱글쓰레드방식
public class BeepPrintExample {
	public static void main(String[] args) {
	//Runnable인터페이스 객체 생성
	  //2.Runnable 인터페이스 객체 생성
	  Runnable beepTask = new BeepTask();
	  //3.Thread의 생성자로 전달하여 Thread객체 생성  
	  Thread thread = new Thread(beepTask);
	  
	  //4.생성된 thread객체의 run()메소드 실행
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
