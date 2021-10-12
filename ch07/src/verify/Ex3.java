package verify;

public class Ex3 {
	public static void main(String[] args) {
	System.out.println("3.final키워드에 대한 설명 틀린것?");
	// 
	System.out.println("X1)final 클래스는 부모 클래스로 사용할수 있다");
	System.out.println("2)final 필드는 값이 저장된 후에 변경할 수 없다.");
	System.out.println("3)final 메소드는 재정의(오버라이딩)할수 없다.");
	System.out.println("4)static final 필드는 상수를 말한다.");
	}
}

class A extends Object{}//Object의 자식클래스
class B extends A{}//B클래스의 부모클래스

//final class AA extends Object{}//Object의 자식클래스
//class BB extends AA{}//(다른)BB클래스의 부모클래스로 변환 불가