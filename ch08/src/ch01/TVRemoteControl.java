package ch01;

//인터페이스로부터 실체 클래스 구현
public class TVRemoteControl implements RemoteControl {
	@Override
	public void method() {
			System.out.println("실체 클래스메소드");
	}	
}
