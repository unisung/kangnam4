package ch03;

public class Student {
//�ʵ�
 private String sno;
 private String name;
	
//������
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
	
	
//�޼ҵ�
}
