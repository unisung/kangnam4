package ch02;

class D1{
	void a() {
		System.out.println("��� �θ� �޼ҵ�");
	}
}
//overrinding �޼ҵ��, �Ű�����, ��ȯ�� ��ġ, ���������ڴ� �ڽ��� �θ��� �о��.
class D2 extends D1{
	public void a() { System.out.println("��� �ڽ� �޼ҵ�");	}//overriding
	public void a(int k) {//�߰��� �޼ҵ�, -overloading
		System.out.println("k method");
	}
}

public class OverRiding {
	public static void main(String[] args) {
	 D1 d1 = new D1(); d1.a();
	 D2 d2 = new D2(); d2.a(); d2.a(7);
	 //�ڽİ�ü�� �����Ͽ� �θ�Ÿ������ ����ȯ �� �޼ҵ� ����
	 //�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ŭ������ ����ȯ�ϴ��� ����� �����ǵ� �������� ����
	 //�ڽ�Ŭ�������� �߰��� �޼ҵ�� �θ�Ŭ������ ����ȯ�� ����Ұ�(���� �θ�޼ҵ忡 ������ ����)
	 D1 d3 = new D2(); d3.a(); 
	 //d3.a(7);//
	 
	}
}
