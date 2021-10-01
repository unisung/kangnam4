package ch03;

public class Student {
//필드
 private String sno;
 private String name;
	
//생성자
public Student() {}
public Student(String sno) {
		this.sno = sno;
}

public Student(String sno, String name) {
		this.sno = sno;
		this.name = name;
}

public String getSno() {
	return sno;
}

public void setSno(String sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
	
//메소드
}
