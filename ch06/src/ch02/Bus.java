package ch02;

public class Bus extends Car {
//필드
	String model="Bus";
//메소드
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
}
