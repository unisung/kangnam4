package ch02_Objects.copy;

import java.util.Comparator;

public class StudentComparator 
   implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
return o1.sno.compareTo(o2.sno);// "ȫ�浿", "ȫ����"
	}
}

class Student{
	 String sno;

	public Student(String sno) {
		this.sno = sno;
	}

}