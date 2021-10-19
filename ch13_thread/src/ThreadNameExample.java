
public class ThreadNameExample {
public static void main(String[] args) {
	//����������� ������ ��� 
	Thread mainThread = Thread.currentThread();//���� �������ξ����� 
	System.out.println("���α׷� ���� ������ �̸�: "+mainThread.getName());//�̸� ���
	
	//������ ��ü����
	ThreadA threadA = new ThreadA();//
	System.out.println("�۾� ������ �̸�:"+threadA.getName());
	threadA.start();
	
	ThreadB threadB = new ThreadB();
	System.out.println("�۾� ������ �̸�:"+threadB.getName());
	threadB.start();

}
}

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");//������ �̸� ���� �����尴ü ����
	}

	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"�� ����� ����");//getName()
		}
	}
}

class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"�� ����� ����");
		}
	}
}