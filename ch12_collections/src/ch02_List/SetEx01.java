package ch02_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {
public static void main(String[] args) {
	 Set<Integer> set = new HashSet<>();
	 System.out.println(set.add(1));
	 System.out.println(set.add(2));
	 System.out.println(set.add(1));//�ߺ���ü ����ȵ�.
	 
	 //�ݺ���
	 Iterator<Integer> itor =set.iterator();
	 while(itor.hasNext()) {
		 System.out.println(itor.next());
	 }
	 
	 //��ü ���翩��Ȯ��
	System.out.println(set.contains(1));
	
	//���尹�� size() 2
	System.out.println(set.size());
	
	//1�� ��ü ����
	System.out.println(set.remove(1));
	
	//���� ����  1
	System.out.println(set.size());
	
	//����ִ��� Ȯ��
	System.out.println(set.isEmpty());
	
	
	//����� ��� ��ü ����
	set.clear();
	
	//����ִ��� Ȯ��
	System.out.println(set.isEmpty());
	
	//
	
	
	 
	 
}
}
