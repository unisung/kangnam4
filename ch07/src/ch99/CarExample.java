package ch99;

public class CarExample {

	public static void main(String[] args) {
		Car car=new Car();
		for(int i=1;i<=5;i++) {
			int problemLcation=car.run();
			
			switch(problemLcation) {
			case 1: car.frontLeftTire =new Tire("����Ÿ�̾�", 7);
			       break;
			case 2: car.frontRightTire =new HankookTire("�տ�����", 15);
		       break;
			case 3: car.backLeftTire =new HankookTire("�ڿ���", 15);
		       break;
			case 4: car.backRightTire =new HankookTire("�ڿ�����", 15);
		       break;
			}
		}
		
	}
}
