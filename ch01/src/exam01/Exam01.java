package exam01;

/* ch01 확인문제*/
public class Exam01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* 1. jdk와 jre의 차이점 */
	 System.out.println("1.JDK는 JRE와 컴파일러등 개발도구가 포함된다.");
	 System.out.println("2.자바 프로그램을 개발하려면 JDK가 반드시 필요하다.");
	 System.out.println("3.자바 프로그램을 실행만 하려면 JRE만 설치해도 된다.");
	 System.out.println("X 4.JRE에는 컴파일러(javac.exe) 포함되어있다.");
	 
	 /*2. JVM 에 대한 설명 */
	 System.out.println("1.JVM은 java.exe 명령어에 의해 실행된다.");
	 System.out.println("2.JVM은 바이트 코드를 기계어로 변환시키고 실행한다.");
	 System.out.println("X3.JVM은 운영체제에 독립적이다.- 종속적이다.");
	 System.out.println("4.바이트 코드는 jvm에 독립적이지만, jvm은 운영체에에 종속적이다.");
	 
	 /*3. 자바프로그램 개발 순서*/
	 System.out.println("3.소스파일작성(~.java) -> 1.바이트코드파일생성(~.class) "
	 		+ "         ->2.java.exe로 JVM기동 -> 4. JVM이 main()블럭실행");

	 /*4.자바소스파일 작성시 틀린 것*/
	 System.out.println("1.자바소스 파일명(A.java)과 클래스명(A)은 대소문자가 동일해야한다.");
	 System.out.println("2.클래스블럭과 메소드 블럭은 반드시 중괄호{}로 감싼다.");
	 System.out.println("3.실행문 뒤에는 반드시 세미콜론(;)을 붙여야 한다.");
	 System.out.println("X4.주석은 /* */ 문자열 안에도 작성할 수 있다.");
	 
	 /*5. 자바 주석문의 종류가 아닌 것? */
	 System.out.println("1.행주석"); //
	 System.out.println("2.범위주석"); /* */
	 System.out.println("3.API 도큐먼트 주석"); /** ...*/
	 System.out.println("X4.범위주석"); /* <!-- ...--> : jsp 주석 */
	 
	 /*6. 이클립스에 대한 설명으로 잘못 된것?*/
	 System.out.println("1.이클립스는 JDK(JRE)를 설치해야 실행할 수 있다.");
	 System.out.println("2.이클립스는 소스파일 저장하면 자동 컴파일되어 바이크 코드 파일생성");
	 System.out.println("3.워크스페이스는 프로젝트들이 생성되는 기본 디렉토리를 말한다.");
	 System.out.println("X4..metatdata는 프로젝트의 소스 파일들이 저장되는 디렉토리이다."
	 		             + "->환경변수, 설정값, 작업히스토리 정보 저장공간");
	 
	 
	 
	 
	}
}
