package verify;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
public static void main(String[] args) {
	System.out.println("3.Set 컬렉션에 대한 설명 중 틀린 것은 무엇입니까?");
	System.out.println("1)대표적인 구현 클래스로는 HashSet, LinkedHashSet, TreeSet이 있다.\r\n"
			+ "2)Set 컬렉션에서 객체를 하나씩 꺼내오고 싶다면 Iterator를 이용한다.\r\n"
			+ "3)HashSet은 hashCode()와 equals()를 이용해서 중복된 객체를 판별한다.\r\n"
			+ "x4)Set 컬렉션에는 null을 저장할 수 없다.");
	
	Set<String> set = new HashSet<>();
	set.add("hello");
	set.add(null);
	set.add("hi");
	//내용 프린트
	System.out.println(set.toString());
	
} 
}
