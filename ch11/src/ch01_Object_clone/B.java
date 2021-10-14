package ch01_Object_clone;

public class B {
  public String name;//����
  public int age;//�⺻
  public int[] scores;//����
  public Car car;//����
  //������
public B(String name, int age, int[] scores, Car car) {
	this.name = name;
	this.age = age;
	this.scores = scores;
	this.car = car;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	B b= (B)super.clone();
	//���� ����
	int[] arr = new int[this.scores.length];
	for(int i=0;i<this.scores.length;i++)
		    arr[i] = this.scores[i];
	b.scores=arr;
	
	//Car ���� ����
	b.car = new Car(this.car.model);
	
	b.name = new String(this.name);
	
	return b; 
 }

public B getB() {
	B cloned = null;
	try {
		cloned = (B)clone();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return cloned;
 } 
}

class Car{
	String model;//����

	public Car(String model) {
		this.model = model;
	}
}