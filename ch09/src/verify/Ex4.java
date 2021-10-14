package verify;

public class Ex4 {
	

public static void main(String[] args) {
  //바깥 클래스 인스턴스 생성
  Car myCar = new Car();
  Car.Tire tire = myCar.new Tire();
  //
  Car.Engine engine = new Car.Engine();
 
}
}
class Car{
 class Tire{}//인스턴스
 static class Engine{}//static
}