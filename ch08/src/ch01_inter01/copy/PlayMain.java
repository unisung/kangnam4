package ch01_inter01.copy;

public class PlayMain {
    //�ʵ�
	//�������̽��� ���� �޼ҵ� ȣ�� ó�� - �� ������
	//����ϴ� ��ü�� ����Ǿ ������Ĵ�� ���
	RemoteControl rc = new Audio();
	
	public static void main(String[] args) {
		PlayMain p=new PlayMain();
		//����ϴ� ��ü�� ������ �Ǿ �ҽ��ڵ庯�� ����.
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
		
	}
}
