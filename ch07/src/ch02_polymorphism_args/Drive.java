package ch02_polymorphism_args;

public class Drive {
	void drive(Vehicle v) {
		v.run();
	}
	
 public static void main(String[] args) {
	Drive drv = new Drive();
	
	Vehicle v1=new Vehicle();
	drv.drive(v1);
	//�Ű������� ������
	Bus bus = new Bus();
	drv.drive(bus);
	//�Ű������� ������
	Truck truck = new Truck();
	drv.drive(truck);
	
}	
}
