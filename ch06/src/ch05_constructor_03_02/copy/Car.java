package ch05_constructor_03_02.copy;

public class Car {
	//�ʵ�
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
         this("�׷���","���",200);
	};
	Car(String model){
		this.model=model;
		System.out.println("�� ���� �������?");
	}
	Car(String model, String color){
		this(model);
		this.color=color;
		System.out.println("�Ű����� �ΰ�¥�� �������?");
	}

	Car(String model,String color, int maxSpeed){
		this(model,color);
		this.maxSpeed=maxSpeed;
		System.out.println("�Ű����� ����¥�� �������?");
	}

	
}
