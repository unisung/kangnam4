package ch03;

public class UserCar {
	public static void main(String[] args) {
		Car car = new Car();
		//�ʵ弱��� ���� �ָ� �ش� �� ���
		System.out.println("model:"+car.model);
		System.out.println("maxSpeed:"+car.maxSpeed);
		//�ʵ弱��� ���� ���� ������ �ش� Ÿ���� �⺻������ ���
		System.out.println("����ӵ�:"+car.currentSpeed);
		System.out.println("�õ�����:"+car.engineStrart);
		System.out.println("Tire:"+car.tire);
	}
}
