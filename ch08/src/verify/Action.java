package verify;

public interface Action {
  void work();
}
//���Ŀ� ���������� ����� ����
class BookAction implements Action{
	@Override
	public void work() {
		System.out.println("������ ����մϴ�");
	}
}
class CheckOutAction implements Action{
	@Override
	public void work() {
		System.out.println("������ �뿩�մϴ�.");
	}
}
class CheckInAction implements Action{
	@Override
	public void work() {
		System.out.println("������ �ݳ��մϴ�.");
	}
}


