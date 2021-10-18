package ch02_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetEx02 {
public static void main(String[] args) {
   //Set�������̽� �� ����� set����
   //Member1 String sno, String name���� ����
   //"1","ȫ�浿"  "2","������"  "3","�Ӳ���", "2","������"
   //�ߺ������Ͽ� ���� �� ��� ��ü�� ���
	Set<Member1> set = new HashSet<>();
	set.add(new Member1("1", "ȫ�浿"));
	set.add(new Member1("2", "������"));
	set.add(new Member1("3", "�Ӳ���"));
	set.add(new Member1("2", "������"));
	
	//���
	Iterator<Member1> itor = set.iterator();
	while(itor.hasNext()) {
		Member1 m=itor.next();
		System.out.println(m);
	}
	
	 
}
}

class Member1{
	private String sno; 
	private String name;
	public Member1(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Member1 [sno=" + sno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		return Objects.equals(name, other.name) && Objects.equals(sno, other.sno);
	}
	
	

	
	
}

