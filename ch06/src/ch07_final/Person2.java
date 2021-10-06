package ch07_final;

import java.util.Scanner;

public class Person2 {
 //final필드는 선언과 동시에 초기화
 final String nation="Korea";
 //생성자에서 final필드를 초기화할수 있는 경우 선언만 해놔도 오류 발생하지 않음.
 final String ssn;
 String name;
 //생성자에 final필드를 초기화 하는 명령문 포함.
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
	Person2 person = new Person2("20010101-1234567","홍길동");
		//person.nation="usa";
		//person.ssn="1234";
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		Person2 person2 = new Person2("20010101-2234567","홍길동");
	} 
}
