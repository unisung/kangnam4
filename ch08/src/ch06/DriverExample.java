package ch06;

public class DriverExample {

	public static void main(String[] args) {
	 Driver driver = new Driver();
	 
	 Bus bus = new Bus();
	 Taxi taxi = new Taxi();
	 
	 //�Ű������� ������ Vehicle vehicle = bus; 
	 driver.drive(bus);
	 driver.drive(taxi);
	 driver.drive(new Bus());//Vehicle vehicle = new Bus();

	}
}
