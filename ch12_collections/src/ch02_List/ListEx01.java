package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {
	public static void main(String[] args) {
		//StringŸ�� ��ü�� �����ϴ� ����Ʈ ����
		List<String> list = new ArrayList<>();//default 10
		//size() ����� ����� ����
		System.out.println(list.size());
		//�߰�-append
		list.add("hello");//[0]
		list.add("hi");//[1]
		list.add("bye");//[2]
		System.out.println(list.size());
		
		//���� add(index��ȣ,��ü)
		list.add(1,"good");//["hello"]["good"]["hi"]["bye"]
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			 System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println(list.contains("hello"));
		//����
		list.set(1, "very good");
		 
		for(int i=0;i<list.size();i++) {
			 System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		String s=list.remove(1);
		System.out.println(s+"�� ������");
		
		boolean result=list.remove("hi");
		System.out.println(result);
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
}
}
