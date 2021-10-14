package verify;

public class Ex5 {
	public void method1() 
			throws NumberFormatException, 
			        ClassNotFoundException{}

	public static void main(String[] args) {
		System.out.println(
 "1) try {method1();}catch(Exception){}\r\n"
+ "2) void method2() throws Exception {method1();}\r\n"
+ "x3) try{mehtod1();} catch(Exception e){"
+ "                   } catch(ClassNotFoundException e){}      -  x\r\n"
+ "4) try{method1();) catch(ClassNotFoundException e) {} catch(NumberFormatException e){}\r\n"
+ "");
	}

}
