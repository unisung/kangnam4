package verify;

public class Ex3 {
	public static void main(String[] args) {
	System.out.println("3.finalŰ���忡 ���� ���� Ʋ����?");
	// 
	System.out.println("X1)final Ŭ������ �θ� Ŭ������ ����Ҽ� �ִ�");
	System.out.println("2)final �ʵ�� ���� ����� �Ŀ� ������ �� ����.");
	System.out.println("3)final �޼ҵ�� ������(�������̵�)�Ҽ� ����.");
	System.out.println("4)static final �ʵ�� ����� ���Ѵ�.");
	}
}

class A extends Object{}//Object�� �ڽ�Ŭ����
class B extends A{}//BŬ������ �θ�Ŭ����

//final class AA extends Object{}//Object�� �ڽ�Ŭ����
//class BB extends AA{}//(�ٸ�)BBŬ������ �θ�Ŭ������ ��ȯ �Ұ�