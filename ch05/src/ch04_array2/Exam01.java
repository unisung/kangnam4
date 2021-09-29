package ch04_array2;

public class Exam01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1. id="hong", pwd="1234"
	  // id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
	  // 아니면 "1회 실패하였습니다". 출력
	  // 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료
	  while(true) {
		   if(cnt==5)System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다");
		   System.out.println("아이디와 패스워드를 입력하세요.");
		   System.out.println("아이디>");
		   System.out.println("패스워드>");
		   if(id가"hong"이고 pwd가"1234") {"로그인 성공"; break;}
		   //실패시
		   System.out.println(cnt+"회 실패하였습니다.");
	  }
		System.out.println("프로그램 종료");
	}
}
