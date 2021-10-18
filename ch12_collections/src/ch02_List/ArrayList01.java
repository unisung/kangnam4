package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
public static void main(String[] args) {
	//List 인터페이스 타입의 변수선언 = ArrayList객체 생성
	List<String> list = new ArrayList<>();
	//객체 추가 메소드 add(객체);
	list.add("Hello");
	list.add("hi");
	list.add("Java");
	
	//객체의 갯수 확인 size()
	int n = list.size();
	//int c = list.capacity(); -없음
	System.out.println(n);
	
	//중간 삽입 add(index,객체)
	list.add(2, "Shani");
	//list.add(5,"Shani");//java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
	
	//저장된 객체 얻기 get(index)
	String str = list.get(1);
	System.out.println(str);
	
	//삭제 remove(index번호)
	list.remove(1);
	//size()값보다 큰 index번호로 삭제시 오류 발생
	//list.remove(4);//java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
	
	
	
	
	
	
	
	
	
	
	
}
}
