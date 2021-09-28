package exam;

/*
 * 6.for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
 *
 * *
 * * *
 * * * *
 * * * * *   
 * */
public class Exam06 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {// i: 1 ,  2, 3, 4, 5
		for(int j=1;j<=i;j++) {//j:1, 2, 3, 4, 5
		  System.out.print("*");//가로
		}	
		System.out.println();//세로
	}
}
}
