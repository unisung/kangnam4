package ch99;

public class Car {
//�ʵ�
	Tire frontLeftTire; //= new Tire("�տ���",6);
	Tire frontRightTire; //= new Tire("�տ�����",2);
	Tire backLeftTire; //= new Tire("�ڿ���",3);
	Tire backRightTire; //= new Tire("�ڿ�����",4);
	
	
	public Car() {
		frontLeftTire = new Tire("�տ���",6);
		frontRightTire = new Tire("�տ�����",2);
		backLeftTire = new Tire("�ڿ���",3);
		backRightTire = new Tire("�ڿ�����",4);
	}
   void m(){
	   frontLeftTire =new Tire("�ٸ�",10);
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
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
}
