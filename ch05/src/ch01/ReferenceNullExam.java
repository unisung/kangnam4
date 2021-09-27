package ch01;

public class ReferenceNullExam {
public static void main(String[] args) {
	String str1 = new String("홍길동");
	System.out.println(str1);
	//출력
	str1=null;
	System.out.println(str1);//null
}
}
