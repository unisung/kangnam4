package ch02_priority;

//공유객체
public class Calculator {
  private int memory;

public int getMemory() {
	return memory;
}

//메소드 동기화 처리
public synchronized void setMemory(int memory) {
	this.memory = memory;
	try {
		  Thread.sleep(2000);//2초가 멈춤
		}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);
}
  
}
