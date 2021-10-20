package verify;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
public static void main(String[] args) {
	System.out.println("5.단일(싱글) 스레드 환경에서 Board 객체를 "
			+ "저장 순서에 맞게 읽고 싶습니다. "
			+ "가장 적합한 컬렉션을 생성하도록 밑줄 친 부분에 코드를 작성해보세요.");
	  List<Board> list = new ArrayList<Board>();    
}
}
class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
}
