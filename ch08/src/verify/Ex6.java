package verify;

/* 무명 인터페이스 */
public class Ex6 {
	public static void main(String[] args) {
		//이 프로그램에서만
		// 1회성으로 인터페이스를 구현해서 실체클래스를 사용하고 끝내겠다.
		// 이름없는 실체 클래스를 만들어서 인터페이스에 대입 후 사용.
		//* 인터페이스와 같은 이름은 생성자를 호출하여 선언
		//  하면 실체 클래스가 생성, 이 생성한 객체를 Action타입에 대입
		Action action=new Action() {// 자식(실체클래스의 객체)을 생성 부모타입에 대입(promotion)
			@Override
			public void work() {//실체클래스에서 재정의와 같음.
	          System.out.println("등록작업");
			}
		};
		action.work();
	    
		//무명 인터페이스(anonymous inner type)
		action = new Action() {
			@Override
			public void work() {
				System.out.println("댓글달기");
			}
		};
		action.work();
	}
}
