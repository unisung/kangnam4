package ch02;

public class CompreExample2 {
	public static void main(String[] args) {
		int age =25;
		//자바에서는 사용불가
		//if(20 <= age < 300){}
		
		if((age >=20) && (age < 30)) {
			System.out.println("20대");
		}
		char c = 'x'; // 'x' => ASCII코드값 비교
		if((c>='A') && (c<='Z')) {// 
			System.out.println("영문대문자");
		}
		int x=50; 	int y= 25;
		if((x>=0) && (y>=0) && (x<=50) && (y<=50)) {
			System.out.println("영역내에 있는 좌표");
		}
	}
}
