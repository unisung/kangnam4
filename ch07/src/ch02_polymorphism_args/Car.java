package ch02_polymorphism_args;

public class Car {
	Tire[] tires= {new Tire(6),new Kumho(2),new Hankook(4),new Kumho(5) };
 public static void main(String[] args) {
	Car car=new Car();
	car.run();
}
 
void run() {
	for(int i=0;i<tires.length;i++) {
		  tires[i].run(tires[i].field);
	}
}
}

class Tire{
  int field;
  Tire(int field){
	  this.field=field;
  }

   void run(int count) {
	   System.out.println(count+"ȸ��");
   }
}
class Kumho extends Tire{
	Kumho(int field) {
		super(field);
	}

	void run(int count) {
		   System.out.println("��ȣ"+count+"ȸ��");
	   }
}
class Hankook extends Tire{
	Hankook(int field) {
		super(field);
	}

	void run(int count) {
		   System.out.println("�ѱ�"+count+"ȸ��");
	   }
}