package ch02_System_Class;

import java.util.Scanner;

public class ReflectExample2 {
public static void main(String[] args) 
		 throws ClassNotFoundException,
		  InstantiationException, IllegalAccessException {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ ��ü�� �Է��ϼ���>");
	String className = "ch02_System_Class."+scanner.next();
//Ŭ���� ���� �ε�	
	Class clazz 
//= Class.forName("ch02_System_Class.SendAction");
	= Class.forName(className);
  System.out.println(clazz.getName());
 
 //Action action = new ReceiveAcction();
  //�ε��� Ŭ���� ������ ��ü���� newInstance() ��, promotion
  Action action = (Action)clazz.newInstance();
   action.execute();  
   }
}