package ch04;

public class ExMan {
public static void main(String[] args) {
	//������
	A a1 = new B();
	A a2 = new C();
	A a3 = new D();
	A a4 = new E();
	
	//�迭- ������ Ÿ���� ���� ����
	A[] arr = new A[5];
	//arr[0]=new A();
	arr[1]=new B();//B ->A
	arr[2]=new C();//C ->A
	arr[3]=new D();//D ->A
	arr[4]=new E();//E ->A
	
	for(int i=1;i<arr.length;i++) {
		System.out.println(arr[i] instanceof A?"AŸ��":"AŸ�� �ƴ�");
	}
	
	
	
	
}
}
