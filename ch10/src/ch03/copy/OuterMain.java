package ch03.copy;

public class OuterMain {
public static void main(String[] args) {
	Outter out = new Outter();
	//Outter클래스의 필드a의 메소드 호출
	try {
	out.method();
	}catch(Exception e) {}
}
}
