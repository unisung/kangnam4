package ch99;

public class Car {
//필드
	Tire frontLeftTire; //= new Tire("앞왼쪽",6);
	Tire frontRightTire; //= new Tire("앞오른쪽",2);
	Tire backLeftTire; //= new Tire("뒤왼쪽",3);
	Tire backRightTire; //= new Tire("뒤오른쪽",4);
	
	
	public Car() {
		frontLeftTire = new Tire("앞왼쪽",6);
		frontRightTire = new Tire("앞오른쪽",2);
		backLeftTire = new Tire("뒤왼쪽",3);
		backRightTire = new Tire("뒤오른쪽",4);
	}
   void m(){
	   frontLeftTire =new Tire("다른",10);
  }
	int run() {
		System.out.println();
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(backLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		return 0;
		}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
