package verify;

public class Ex1 {
public static void main(String[] args) {
 System.out.println("1.인터페이스에 대한 설명 틀린 것");	
 System.out.println("1)인터페이스는 객체 사용 설명서 역할을 한다.");
 System.out.println("2)구현 클래스가 인터페이스의 추상메소드에 "
 		             + "대한 실체 메소드를 가지고 있지 않으면 "
 		             + "추상클래스가 된다.");
   //실체 클래스 void m(){} 
   //->추상 클래스abstract class A{ abstract void m();} 
 System.out.println("X3)인터페이스는 인스턴스 필드를 가질 수 있다.");
 System.out.println("4)구현 객체는 인터페이스타입으로 자동 형변환된다.");
}
}
