package verify;

public class Ex6 {
public static void main(String[] args) {
	Child1 child = new Child1();
}
}

class Parent1{
	public String nation;

	public Parent1() {
		this("���ѹα�");
		System.out.println("Parent1() call");
	}
	
   public Parent1(String nation) {
	   this.nation=nation;
	   System.out.println("Parent1(String nation) call");
   }
}
class Child1 extends Parent1{
	private String name;
	public Child1() {
		this("ȫ�浿");
		System.out.println("Child1() call");
	}
	public Child1(String name) {
		this.name=name;
		System.out.println("Child1(String name) call");
	}
}
