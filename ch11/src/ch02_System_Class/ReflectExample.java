package ch02_System_Class;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectExample {
public static void main(String[] args) 
		 throws ClassNotFoundException {
	  Class clazz 
= Class.forName("ch02_System_Class.ReceiveAcction");
  System.out.println(clazz.getName());
  //���÷���
  Constructor[] constructors
   = clazz.getConstructors();
   for(Constructor cons:constructors) {
	   System.out.print(cons.getName()+"(");
	   Class[] params = cons.getParameterTypes();
	   Arrays.toString(params);
	   System.out.println(")");
   }
  
	}
}
