package verify;

/* �޼ҵ� �����ε� ���� */
public class Ex16 {
public static void main(String[] args) {
	Printer printer = new Printer();
	printer.println(10);
	printer.println(true);
	printer.println(5.7);
	printer.println("ȫ�浿");
	
	//EX17
	//static�޼ҵ� ȣ��
	Printer.print(10);
	Printer.print(true);
	Printer.print(5.7);
	Printer.print("ȫ�浿");
}
}
class Printer{
	//�޼ҵ� �����ε� 
	void println(int i) {System.out.println(i);}
	void println(boolean b) {System.out.println(b);}
	void println(double d) {System.out.println(d);}
	void println(String str) {System.out.println(str);}
	
	//static ��� - nonstatic��� ����
	static void print(int i) {System.out.println(i);}
	static void print(boolean b) {System.out.println(b);}
	static void print(double d) {System.out.println(d);}
	static void print(String str) {System.out.println(str);}
	
}
