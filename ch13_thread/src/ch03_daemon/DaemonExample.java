package ch03_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread
		 = new AutoSaveThread();
		//start()���� ���� ó��
		autoSaveThread.setDaemon(true);
		//setDaemon(true)�� ����
		autoSaveThread.start();
		
		try{
		    Thread.sleep(3000);//3�ʰ� ����
		}catch(Exception e) {	
		}
		System.out.println("���� ������ ����");
	}
}
