package ch01_02;

public class Ex02 {
public static void main(String[] args) {
	MyFunctionalInterface fi
	 = new MyFunctionalInterface() {
		@Override
		public void method(int x) {
		  System.out.println(x);	
		}
	};
	fi.method(10);
	
	//¶÷´Ù½Ä
	fi = x -> System.out.println(x);
	fi.method(20);
	
	
	
}
}
