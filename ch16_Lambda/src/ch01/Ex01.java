package ch01;

public class Ex01 {
	public static void main(String[] args) {
      MyFunctionalInterface fi
       = new MyFunctionalInterface() {	
		@Override
		public void method() {
		 System.out.println("hello");
		}
	};
	
	fi.method();
	//�� ���α׷� ������ �������Ͽ� ���
	//���ٽ� ��ȯ
	fi = ()->System.out.println("hello");
	//fi.method()ȣ���ϸ� jvm�� �ڵ����� �������̽��� �޼ҵ�ȣ��
	fi.method();
	
	
	
	

	}

}
