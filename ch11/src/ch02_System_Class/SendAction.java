package ch02_System_Class;

public class SendAction implements Action{

	@Override
	public void execute() {
	System.out.println("메세지 보내기");
	}
}
