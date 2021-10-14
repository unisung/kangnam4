package ch01_Object_clone;

public class ConeEx1 {
	public static void main(String[] args) throws CloneNotSupportedException {
	  A a=new A();
	  A b=(A)(a.clone());

	}

}
