package ch06_methods_01;

public class Ex06 {
	public static void main(String[] args) {
		F1 f1 = new F1();
		f1.fact1(5);
        f1.fact2(5);
	}
}
class F1{
	int result1=1, result2=1;
	//3���� �Ű�����O, ����Ÿ��X
	//5*4*3*2*1 = 5!
	void fact1(int x) {
		for(int i=x;i>=1;i--) {
			result1*=i;
			if(i!=1) System.out.print(i+ " * ");
			else System.out.println(i + " = " +result1);
		}
	}
	//�Ű�����O, ����Ÿ��X 
	//�Լ������� �ڽ��� ȣ�� �ϴ� ���� - ����Լ�(��͸޼ҵ�)
	void fact2(int x) {
		result2*=x;//
		if(x!=1) {
			System.out.print(x+" * ");
			fact2(--x);
		}else {
			System.out.println(x + " = " + result2);
		}
	}
}