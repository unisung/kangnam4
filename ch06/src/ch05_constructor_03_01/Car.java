package ch05_constructor_03_01;

public class Car {
	//�ʵ�
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){}
	//���� Ŭ���������� �ٸ� ������ ȣ��� 
	//this()�޼ҵ�� ȣ��
	//���� ����- �ݵ�� ȣ���ϴ� �������� ù ���ο� ���� �ؾ���.
	Car(String model){
		this.model=model;
	}
	Car(String model, String color){
		//Car(model);
		this(model);
		this.color=color;
	} // String, String

	Car(String model,String color, int maxSpeed){
		//Car(model,color);
		this(model,color);
		this.maxSpeed=maxSpeed;
	}//String, String, int
	

    //�޼ҵ�
	
}
