package ch02_Objects.copy;

import java.util.Objects;

public class CompareEx {
public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿");
		Student s2 = new Student("ȫ�浿");
		Student s3 = new Student("ȫ����");
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
	}
}
