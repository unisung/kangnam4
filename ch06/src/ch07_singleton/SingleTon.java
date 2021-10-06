package ch07_singleton;

/*�̱������� Ŭ���� ���� */
public class SingleTon {
//1.�ڽ�Ÿ���� static�ʵ� ����
   private static SingleTon instance=new SingleTon();
//2.�����ڸ� �ܺο��� ���� ���ϰ� private�� ó��
   private SingleTon(){}
//3.public �޼ҵ�� �����ϵ��� �޼ҵ� ����   
public static SingleTon getInstance() {
	return instance;
}

}
