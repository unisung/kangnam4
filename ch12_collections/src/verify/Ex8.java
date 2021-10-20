package verify;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex8 {
public static void main(String[] args) {
	Set<Student> set = new HashSet<>();

    set.add(new Student(1, "È«±æµ¿"));
    set.add(new Student(2, "½Å¿ë±Ç"));
    set.add(new Student(1, "Á¶¹Î¿ì"));
    
    Iterator<Student> iterator = set.iterator();
    while(iterator.hasNext()) {
    	Student student = iterator.next();
    	System.out.println(student.studentNum+":"+student.name);
    }
	
}
}
class Student {
	public int studentNum;//Å°
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.hashCode()+studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		return this.studentNum==((Student)obj).studentNum;
	}

	
}