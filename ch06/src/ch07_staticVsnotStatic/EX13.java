package ch07_staticVsnotStatic;

public class EX13 {
	public static void main(String[] args) {
	 Car1 c1 = new Car1("�ҳ�Ÿ",2000,"����");
	 c1.print();
	}
}
class Car1{
	//�ʵ�
	String kind;
	int cc;
	String color;
	//������- this.�ν��Ͻ��ڽ��� ����Ŵ. ���ú����� �ʵ屸�п� this.
	Car1(String kind, int cc, String color){
		this.kind=kind; this.cc=cc; this.color=color;
	}
	//kin,cc,color�� �ʵ�
	void print() {
		System.out.println("����:"+kind);
		System.out.println("��ⷮ:"+cc);
		System.out.println("����:"+color);
	}
}
