package ch02_Arrays;

import java.util.Arrays;

public class SortExample {
public static void main(String[] args) {
	Member m1 = new Member("ȫ�浿");//D64D
	Member m2 = new Member("�ڵ���");//BC15
	Member m3 = new Member("��μ�");//AE40
	Member[] members = {m1,m2,m3};
	
	for(Member m:members)
		System.out.println(m);
	
	//�������� ����
	Arrays.sort(members);
	for(Member m:members)
		System.out.println(m);
}
}
//sort�޼ҵ� ����ϴ� ��ü�� Comparable�������̽��� ������ ��ü�� ����
class Member implements Comparable<Member>{//<>
	String name;
	
	public Member(String name) { this.name = name;}
    
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);//ȫ����, ȫ�浿
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	
}
