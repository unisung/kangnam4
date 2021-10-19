package ch03_daemon;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autosaveThread = new AutoSaveThread();
		autosaveThread.setName("AutoSaveThread");
		autosaveThread.setDaemon(true);
		autosaveThread.start();
		
		//���� �������� Thread�� ���� ���
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
		//Thread������ ����
		Set<Thread> threads = map.keySet();
		//
		for(Thread thread:threads) {
			System.out.println("Name:"+thread.getName()+(thread.isDaemon()?"(����)":"(��)"));
			System.out.println("\t"+"�Ҽ� �׷�:"+thread.getThreadGroup().getName());//�׷� 
			System.out.println();
		}
	}
}
