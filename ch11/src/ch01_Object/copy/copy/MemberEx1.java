package ch01_Object.copy.copy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx1 {
	public static void main(String[] args) {

    //물리적 다른 객체 
     Member member1 = new Member("홍길동",18);
     Member member2 = new Member("홍길동",18);
     Member member3 = new Member("홍길동",35);
    
     System.out.println(member1.name.hashCode());
     System.out.println(member2.name.hashCode());
     
     System.out.println(member1.hashCode());
     System.out.println(member2.hashCode());
     System.out.println(member3.hashCode());
     
     System.out.println(member1.equals(member2));
     System.out.println(member1.equals(member3));
     

     //저장용 객체 생성
     Set<Member> set = new HashSet<Member>();
     //저장
     set.add(member1);
     set.add(member2);
     set.add(member3);
     
     //저장객체 출력
     //Iterator: 반복자(Set객체 저장된 객체를 처음부터 끝까지 한번씩 순회하면서 가져오는 역할)
     Iterator<Member> itor = set.iterator();
     while(itor.hasNext()) {
    	 Member member = itor.next();
    	 System.out.println(member.getName()+","+member.getAge());
     }
     
     
     
     
	}
}
