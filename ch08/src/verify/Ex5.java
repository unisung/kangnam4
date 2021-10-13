package verify;

public class Ex5 {
	public static void main(String[] args) {
		//promotion(자식 ->부모)
		Action action=new BookAction();
		action.work();
		//upcasting
		action=new CheckInAction();
		action.work();
		//upcasting
		action=new CheckInAction();
		action.work();
	}
}

