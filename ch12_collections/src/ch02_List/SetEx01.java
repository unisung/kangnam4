package ch02_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {
public static void main(String[] args) {
	 Set<Integer> set = new HashSet<>();
	 System.out.println(set.add(1));
	 System.out.println(set.add(2));
	 System.out.println(set.add(1));//중복객체 저장안됨.
	 
	 //반복자
	 Iterator<Integer> itor =set.iterator();
	 while(itor.hasNext()) {
		 System.out.println(itor.next());
	 }
	 
	 //객체 존재여부확인
	System.out.println(set.contains(1));
	
	//저장갯수 size() 2
	System.out.println(set.size());
	
	//1번 객체 삭제
	System.out.println(set.remove(1));
	
	//저장 갯수  1
	System.out.println(set.size());
	
	//비어있는지 확인
	System.out.println(set.isEmpty());
	
	
	//저장된 모든 객체 삭제
	set.clear();
	
	//비어있는지 확인
	System.out.println(set.isEmpty());
	
	//
	
	
	 
	 
}
}
