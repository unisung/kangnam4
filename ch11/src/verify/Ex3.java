package verify;

import java.util.HashMap;

public class Ex3 {
public static void main(String[] args) {
	System.out.println("Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������̵��ؼ�\r\n"
			+ "Student�� �й�(studentNum)�� ������ ���� ��ü�� �� �� �ֵ��� �غ�����. Student Ŭ��\r\n"
			+ "���� �ʵ�� ������ �����ϴ�. hashCode()�� ���ϰ��� studentNum �ʵ尪�� �ؽ��ڵ带 ��\r\n"
			+ "���ϵ��� �ϼ���.");
	
	//Student Ű�� ������ �����ϴ� HashMap��ü ����
	HashMap<Student,String> hashMap = new HashMap<>();
	
	//new Student("1")�� ���� 95�� ����
	hashMap.put(new Student("1"), "95");
	
	//
	String score = hashMap.get(new Student("1"));
	System.out.println("1�� �л��� ����:"+score);
	
	
}
}
class Student{
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	//1.hashCode()

	@Override
	public int hashCode() {
		return studentNum.hashCode();//String�� ������ ������ hashCode���� ����. "1", "1"
	}

	//2.equals()
	@Override
	public boolean equals(Object obj) {//��ü�� promotion
		if(obj instanceof Student) {//������
		 return this.studentNum.equals(((Student)obj).getStudentNum());//casting
		}
		return false;
	}
}