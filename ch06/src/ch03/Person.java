package ch03;

public class Person {
	//�ʵ�
	String name;//�����Ӽ�
	int year;//���� �Ӽ�
	int age;//�������
	
	//������
	Person(String name, int year){
		this.name=name;
		this.year=year;
	}
	
	//�޼ҵ�
	void personInfo() {
		age = 2021 - year; 
		System.out.println(name+","+age+"");
	}
}
