package verify;

/* 메소드 오버로딩 문제 */
public class Ex16 {
public static void main(String[] args) {
	Printer printer = new Printer();
	printer.println(10);
	printer.println(true);
	printer.println(5.7);
	printer.println("홍길동");
	
	//EX17
	//static메소드 호출
	Printer.print(10);
	Printer.print(true);
	Printer.print(5.7);
	Printer.print("홍길동");
}
}
class Printer{
	//메소드 오버로딩 
	void println(int i) {System.out.println(i);}
	void println(boolean b) {System.out.println(b);}
	void println(double d) {System.out.println(d);}
	void println(String str) {System.out.println(str);}
	
	//static 멤버 - nonstatic멤버 구분
	static void print(int i) {System.out.println(i);}
	static void print(boolean b) {System.out.println(b);}
	static void print(double d) {System.out.println(d);}
	static void print(String str) {System.out.println(str);}
	
}
