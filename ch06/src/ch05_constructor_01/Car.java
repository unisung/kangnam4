package ch05_constructor_01;

//�ҽ�����
public class Car {
  //�ʵ�
	String model;
	String color;
	int maxSpeed;
//������
//Ŭ������(�Ű�����1, �Ű�����2, �Ű�����3){}	
  Car(String model, String color, int maxSpeed){
	  this.model=model;
	  this.color=color;
	  this.maxSpeed = maxSpeed;
  }
}
/* �����Ͻ� Car(�Ű�����1,�Ű�����2,�Ű�����3,...){}
 * �����ڰ� �����ϹǷ� Ŭ�������Ͽ� �⺻�����ڸ� �߰���������.
 * public class Car{
 * X-> Car(){} �⺻�����ڸ� �߰����� ����.
 * String model;
	String color;
   int maxSpeed;
 * Car(String model, String color, int maxSpeed){
	  this.model=model;
	  this.color=color;
	  this.maxSpeed = maxSpeed;
  }
 * */
