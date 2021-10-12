package verify;

public class Ex4 {
	public static void main(String[] args) {
	System.out.println("4.오버라이딩(overriding)?");
	System.out.println("1)부모 메소드의 시그니처(리턴타입, 메소드명, 매개변수)와 동일해야한다.");//오버라이딩 전제 조건
	System.out.println("2)부모 메소드보다 좁은 접근 제한자를 붙일 수 없다 (부모public ->자식 private 불가)");
	System.out.println("3)@Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.");
	System.out.println("X4)portected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의 할 수 없다.");
	}
}
