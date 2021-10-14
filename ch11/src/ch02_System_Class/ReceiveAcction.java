package ch02_System_Class;

public class ReceiveAcction 
     implements Action {

	@Override
	public void execute() {
	System.out.println("메세지 받기");
	}
}
