package ch02_List;

import java.util.Comparator;
import java.util.Vector;

public class LinkedListEx4 {
public static void main(String[] args) {
	// MemberŬ���� int sno, String name
	// 1,"ȫ�浿", 2,"������", 3, "�Ӳ���" �����ϴ� LinkedList�����Ͽ� ����
	  // List<Member> list = new LinkedList<>();
	  Vector<Member> list = new Vector<>();
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

