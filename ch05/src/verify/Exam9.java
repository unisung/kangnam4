package verify;

import java.util.Scanner;

/* 
9. 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를
   구하는 프로그램입니다. 실행 결과를 보고, 알맞게 작성해보세요.
   (참고로 16라인에서 Scanner의 nextInt()메소드는 콘솔에 입력된 숫자를 읽고 리턴합니다.)
 *실행결과
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>1
	 * 학생수>3
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>2
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>3
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>4
	 * 최고 점수 : 95
	 * 평균 점수 : 91.0
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>5
	 * 프로그램 종료 
 * */
public class Exam9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
        	System.out.println("-------------------------------------");
        	System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
        	System.out.println("-------------------------------------");
        	System.out.println("선택> ");
        	
        	int selectNo = scanner.nextInt();
        	
        	switch(selectNo) {
        	case 1: System.out.print("학생수>");
        			studentNum = scanner.nextInt(); 
        			scores = new int[studentNum];//초기값을 모름, 저장될 공간의 길이 확보
        			//System.out.println("저장할 학생 수:"+scores.length);
        		    break;
        	case 2: for(int i=0;i<scores.length;i++) {
        		      System.out.print("scores["+i+"]>");
        		      scores[i]=scanner.nextInt();
        			 }
        	         System.out.println("입력완료");
        		    break;
        	case 3: for(int i=0;i<scores.length;i++) 
		  		      System.out.println("scores["+i+"]>"+scores[i]);
        		    break;
        	case 4: int max=0,sum=0;
        	     
    				for(int i=0;i<scores.length;i++) {
    					if(scores[i] > max) max=scores[i];
    					 sum+=scores[i];
    				} 
        		    System.out.println("최고점수:"+max);
        			System.out.println("평균점수:"+sum/(double)scores.length);
        		    break;
        	case 5: run=!run;
        		    break;
        	}
        }//while문 끝.
        System.out.println("프로그램 종료");
	}
}
