package verify;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
public static void main(String[] args) {
	System.out.println("5.����(�̱�) ������ ȯ�濡�� Board ��ü�� "
			+ "���� ������ �°� �а� �ͽ��ϴ�. "
			+ "���� ������ �÷����� �����ϵ��� ���� ģ �κп� �ڵ带 �ۼ��غ�����.");
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
