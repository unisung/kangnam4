package ch07_staticVsnotStatic;

public class CarMain {
public static void main(String[] args) {
	//not-static����� ��ü�� ���� �� ���ٰ���
	//non-static����� ��ü���� ���������� ����
	Car myCar = new Car();
	myCar.gas=10;
	myCar.setSpeed(80);
	//��ü �Ҹ�� ���� �����.
	myCar=null;
	
	Car yourCar = new Car();
	yourCar.gas=20;
	yourCar.setSpeed(100);
	yourCar=null;
}
}
class Car{
	//�ʵ�
	int gas;//gas=0
	
	//�޼ҵ�
	void setSpeed(int speed){}
}