package ch01_inter01;

public class PlayMain {
    //�ʵ�
	//����ϴ� ��ü�� ���� ���ٽ� - ������
	//����ϴ� ��ü�� ����
	//Television tv =new Television();
	Audio audio = new Audio();
	
	public static void main(String[] args) {
		PlayMain p=new PlayMain();
		//����ϴ� ��ü ���ܿ� ���� ����(�ҽ� �ڵ�) ����
		//p.tv.turnOn();
		//p.tv.setVolume(5);
		//p.tv.turnOff();
	   	
		p.audio.turnOn();
		p.audio.setVolume(5);
		p.audio.turnOff();
		
	}
}
