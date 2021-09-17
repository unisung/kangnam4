package ch03;

public class Exam01 {
	public static void main(String[] args) {
		// 변수의 선언
		//int x = 1.5; //1.정수(int)타입 변수에 실수(double)타입 범위의 값 대입 연산. 
		int x = (int)1.5;//1.5 -> 정수 1로 강제로 바뀜
		
		//int 2nd = 20;//2.변수식별자 이름 명명규칙에서 숫자로 시작되는 변수 선언불가.
		 int nd2 = 20;
		 
		//int myMoney# = 25;//3.변수명에 '$'나 '_'외의 특수문자 사용불가.
		int myMoney = 25;
		
		//float f = 12.25;//4.실수(double)타입의 리터럴을 실수(float)범위 변수에 대입 불가
		float f = (float)12.25;
		
		//int result = 12 + 15.3;//5.정수 + 실수 => 실수 + 실수 =>실수를 정수범위 변수 대입 불가
		int result = 12 + (int)15.3;
		
		//String _name = '홍길동';//6.char(문자)''타입의 리터럴은 1자,String(문자열)""로 변환해야함.
		String _name = "홍길동";		
	}
}