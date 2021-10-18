package ch02_List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx03 {
public static void main(String[] args) {
	// MemberŬ���� int sno, String name
	// 1,"ȫ�浿", 2,"������", 3, "�Ӳ���" �����ϴ� LinkedList�����Ͽ� ����
	   List<Member> list = new LinkedList<>();
	   list.add(new Member(1,"ȫ�浿"));
	   list.add(new Member(2,"������"));
	   list.add(new Member(3,"�Ӳ���"));
	//2. list�� ������ ��ü�� �����ϴ��� Ȯ��
	   boolean result=list.contains(new Member(2,"������"));
	   System.out.println(result);
	//3. index��ȣ 2���� �ش��ϴ� ��ü�� 4,"�̼���" ���� ��ü
	   list.set(2, new Member(4,"�̼���"));
	//4. ��ü ����� ���
	   for(int i=0;i<list.size();i++) {
		    Member m=list.get(i);
		    System.out.println(m);
	   }
	//5. sort�� ���
	   list.sort(new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return   o2.getSno()-o1.getSno();//
		}
	});
	   for(int i=0;i<list.size();i++) {
		    Member m=list.get(i);
		    System.out.println(m);
	   }
}
}
class Member{
	private int sno;
	private String name;
	public Member(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Member [sno=" + sno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		return sno==((Member)obj).getSno();
	}
	
	
}
