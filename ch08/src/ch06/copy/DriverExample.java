package ch06.copy;

public class DriverExample {

	public static void main(String[] args) {
	 Driver driver = new Driver();
	/*
	 Vehicle vehicle;
	 Taxi taxi = new Taxi();
	 Bus bus = new Bus();
	  vehicle = taxi;
	  taxi = (Taxi)vehicle;
	  taxi.checkFare();
	   
	  vehicle = bus;
	  bus = (Bus)vehicle;
	  bus.checkFare();
	  */ 
	 
	 //�Ű������� ������
	 driver.drive(new Bus());
	 driver.drive(new Taxi());
 
	}
}
