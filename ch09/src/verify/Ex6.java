package verify;

public class Ex6 {
	//����Ŭ�������� ���Ǵ� ������ final�� Ư���� ����.
	void startChat(final String chatId) {
		final String nickName = chatId;
	    //nickName = chatId;
	    //�͸�ü ����
	    Chat chat = new Chat() {
	     public void start() {
	    	 while(true) {
	    	String inputData = "�ȳ��ϼ���";
	    	String message = "[" + nickName + "]" + inputData;
	    	sendMessage(message); 
	    	 }
	     }
	    };
	    chat.start();
}	
	
class Chat{
	void start() {}
	void sendMessage(String message) {}
}
	
	public static void main(String[] args) {}

}
