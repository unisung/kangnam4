package verify;

public class Ex5 {
	public static void main(String[] args) {
		//promotion(�ڽ� ->�θ�)
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

