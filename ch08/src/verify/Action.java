package verify;

public interface Action {
  void work();
}
//향후에 지속적으로 사용할 목적
class BookAction implements Action{
	@Override
	public void work() {
		System.out.println("도서를 등록합니다");
	}
}
class CheckOutAction implements Action{
	@Override
	public void work() {
		System.out.println("도서를 대여합니다.");
	}
}
class CheckInAction implements Action{
	@Override
	public void work() {
		System.out.println("도서를 반납합니다.");
	}
}


