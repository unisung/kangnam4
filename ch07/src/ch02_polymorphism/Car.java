package ch02_polymorphism;

public class Car {
  //�ʵ� �ʱ�ȭ int i=10;
  // �ʵ��� ������
  //Tire tire=new Tire();
  //Tire tire = new HankookTire();
	Tire tire=new KumhoTire();
}
class Tire{
	void run() {}
}

class HankookTire extends Tire{}
class KumhoTire extends Tire{}