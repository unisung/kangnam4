package ch07_final;

import java.util.Scanner;

public class Person2 {
 //final�ʵ�� ����� ���ÿ� �ʱ�ȭ
 final String nation="Korea";
 //�����ڿ��� final�ʵ带 �ʱ�ȭ�Ҽ� �ִ� ��� ���� �س��� ���� �߻����� ����.
 final String ssn;
 String name;
 //�����ڿ� final�ʵ带 �ʱ�ȭ �ϴ� ��ɹ� ����.
public Person2(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
	 Person2[] persons = new Person2[1000];
	 Scanner scanner = new Scanner(System.in);
	 boolean run=true;
	 int index=0;
	 while(run) {
		 String ssn=scanner.next();
		 String name=scanner.next();
		 Person2 person = new Person2(ssn,name);
		 persons[index++]=person;
	 }	 
	Person2 person = new Person2("20010101-1234567","ȫ�浿");
		//person.nation="usa";
		//person.ssn="1234";
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		Person2 person2 = new Person2("20010101-2234567","ȫ�浿");
	} 
}
