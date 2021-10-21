package ch02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


public class FunctionExample {
	private static List<Student> list 
	        =Arrays.asList(new Student("ȫ�浿",90,96),new Student("������",95,93));
	
	public static void printString(Function<Student,String> function) {
		for(Student student:list) {
			System.out.println(function.apply(student)+" ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student:list) {
			System.out.println(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	 System.out.println("[�л� �̸�]");
	 printString(new Function<Student, String>() {
		@Override
		public String apply(Student student) {
			return student.getName();
		}
	});
	 //���ٽ�
	 printString(student->student.getName());
	 
    System.out.println("[��������]");
    printInt(new ToIntFunction<Student>() {	
		@Override
		public int applyAsInt(Student value) {
			return value.getEnglishScore();
		}
	});
    //���ٽ�
    printInt(value->value.getEnglishScore());
    
    System.out.println("[��������]");
    printInt(new ToIntFunction<Student>() {
		@Override
		public int applyAsInt(Student student) {
			return student.getMathScore();
		}
	});
    //���ٽ�
     printInt(student->student.getMathScore());
	}
}
