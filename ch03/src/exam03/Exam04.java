package exam03;

/* 534자루의 연필 30명에게 똑같이 나누어줌. 몫, 나머지 */
public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		//학생 한명이 가지는 연필 수
		int pencilPerStudent = pencils/students;//정수/정수=정수 몫
		System.out.println(pencilPerStudent);
		
		//남은 연필 수
		int pencilsLeft =pencils % students;//정수%정수 =정수 나머지
		System.out.println(pencilsLeft);		
		
	}
}
