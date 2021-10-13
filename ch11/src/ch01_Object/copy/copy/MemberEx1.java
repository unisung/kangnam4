package ch01_Object.copy.copy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx1 {
	public static void main(String[] args) {

    //������ �ٸ� ��ü 
     Member member1 = new Member("ȫ�浿",18);
     Member member2 = new Member("ȫ�浿",18);
     Member member3 = new Member("ȫ�浿",35);
    
     System.out.println(member1.hashCode());
     System.out.println(member2.hashCode());
     System.out.println(member3.hashCode());
     
     System.out.println(member1.equals(member2));
     System.out.println(member1.equals(member3));
     

     //����� ��ü ����
     Set<Member> set = new HashSet<Member>();
     //����
     set.add(member1);
     set.add(member2);
     set.add(member3);
     
     //���尴ü ���
     //Iterator: �ݺ���(Set��ü ����� ��ü�� ó������ ������ �ѹ��� ��ȸ�ϸ鼭 �������� ����)
     Iterator<Member> itor = set.iterator();
     while(itor.hasNext()) {
    	 Member member = itor.next();
    	 System.out.println(member.getName()+","+member.getAge());
     }
     
     
     
     
	}
}
