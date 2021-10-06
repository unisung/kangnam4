package ch07_final;

public class Person {
 //final필드는 선언과 동시에 초기화
 final String nation="Korea";
 //생성자에서 final필드를 초기화할수 있는 경우 선언만 해놔도 오류 발생하지 않음.
 final String ssn;
 String name;
 //생성자에 final필드를 초기화 하는 명령문 포함.
public Person(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
		Person person = new Person("20010101-1234567","홍길동");
		//person.nation="usa";
		//person.ssn="1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		Person person2 = new Person("20010101-2234567","홍길동");
	} 
}
