package verify;

public class Ex4 {
	

public static void main(String[] args) {
  //�ٱ� Ŭ���� �ν��Ͻ� ����
  Car myCar = new Car();
  Car.Tire tire = myCar.new Tire();
  //
  Car.Engine engine = new Car.Engine();
 
}
}
class Car{
 class Tire{}//�ν��Ͻ�
 static class Engine{}//static
}