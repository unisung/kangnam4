package verify;

/* ���� �������̽� */
public class Ex6 {
	public static void main(String[] args) {
		//�� ���α׷�������
		// 1ȸ������ �������̽��� �����ؼ� ��üŬ������ ����ϰ� �����ڴ�.
		// �̸����� ��ü Ŭ������ ���� �������̽��� ���� �� ���.
		//* �������̽��� ���� �̸��� �����ڸ� ȣ���Ͽ� ����
		//  �ϸ� ��ü Ŭ������ ����, �� ������ ��ü�� ActionŸ�Կ� ����
		Action action=new Action() {// �ڽ�(��üŬ������ ��ü)�� ���� �θ�Ÿ�Կ� ����(promotion)
			@Override
			public void work() {//��üŬ�������� �����ǿ� ����.
	          System.out.println("����۾�");
			}
		};
		action.work();
	    
		//���� �������̽�(anonymous inner type)
		action = new Action() {
			@Override
			public void work() {
				System.out.println("��۴ޱ�");
			}
		};
		action.work();
	}
}
