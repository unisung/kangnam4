package ch07_staticVsnotStatic;

public class StaticVsInstanceMemberEx {
	public static void main(String[] args) {
	  int a=10;//���ú���-main�޼ҵ� �������� ���	
	}
}

class A1{
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1(){}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� �޼ҵ� ���� ���� Ŭ�������� static���, instance��� ��� ����(ȣ��)����
	void method4() {
	  this.field1=0;//�ν��Ͻ� �ʵ�
	  field2=10;//static �ʵ�
	  method1();//�ν��Ͻ� �޼ҵ�
	  method2();//static �޼ҵ�
	}
	
	//static �޼ҵ� ������ static���� ����� ���(�ʵ�� �޼ҵ�) �� ��밡��.
 static void method3() {
	 //field1=0;//�ν��Ͻ� �ʵ�
	 //this.field1=10; //thisŰ���� ���Ұ�
	 field2=10;//static �ʵ�
	 //method1();//�ν��Ͻ� �޼ҵ�
	 //this.method1(); //thisŰ���� ���Ұ�
	 method2();//static �޼ҵ�
	}
	
	
	
	
	
	
}