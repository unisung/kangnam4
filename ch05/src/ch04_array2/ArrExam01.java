package ch04_array2;

import java.util.Scanner;

public class ArrExam01 {
 public static void main(String[] args) {
  //성적표 프로그램
  //스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92}; 
  // int[] scores=new int[8];
  //입력이 끝나면 합계, 평균, 성적순 출력하기
  // for문과 향상된 for문으로 출력하기
  // 1.성적입력 | 2.통계(합/평균)출력| 3. 성적순 출력하기 | 4. 종료
  //ch04 - 7번 참조.
	 Scanner scanner = new Scanner(System.in);
	 int[] scores=new int[8];
	 boolean run=true;
	 while(run) {
		 System.out.println("---------------------------------------");
 System.out.println("1.성적입력|2.통계(합/평균)출력|3.성적순 출력하기|4. 종료");
  System.out.println("---------------------------------------");
  int menu=scanner.nextInt();
  switch(menu){
  case 1: 
	     for() {
	    	 scores[i]=scanner.nextInt();
	     }
	     break;
  case 2:
	     for() {
	    	 
	     }
	     break;
  case 3:
	     for() {
	    	 
	     }
	     break;
  case 4: run = !run;
  }
  
	}
	 
	 
}
}
