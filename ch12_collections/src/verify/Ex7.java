package verify;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
public static void main(String[] args) {
	BoardDao dao = new BoardDao();
	//�ν��Ͻ��� �޼ҵ� ȣ�� - ��������.�޼ҵ��(); ���ϰ� -���� Ÿ��
	List<Board> list = dao.getBoardList();
	for(Board board:list) {
		System.out.println(board.getTitle()+"-"+board.getContent());
	}
 }
}
class BoardDao{
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("����1","����1"));
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
		
		return list;
	}
}