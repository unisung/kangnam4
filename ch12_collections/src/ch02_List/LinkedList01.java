package ch02_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	public static void main(String[] args) {
		//StringŸ�� ��ü�� �����ϴ� ����Ʈ ����
				//List<String> list = new ArrayList<>();//default 10
		        List<String> list = new LinkedList<>();
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
				//get(index��ȣ) list���� ��������
				for(int i=0;i<list.size();i++) {
					 System.out.print(list.get(i)+" ");
				}
				System.out.println();
				
				//list�� �ش� ��ü�� ����ִ��� Ȯ�� contains()
				System.out.println(list.contains("hello"));
				//����
				list.set(1, "very good");
				 
				for(int i=0;i<list.size();i++) {
					 System.out.print(list.get(i)+" ");
				}
				System.out.println();
				//����� ��� ���� remove(index) ���ϰ��� ������ ��ü
				String s=list.remove(1);
				System.out.println(s+"�� ������");
				//����� ��� ���� remove(��ü) ���ϰ��� booleanŸ�� ��
				boolean result=list.remove("hi");
				System.out.println(result);
				System.out.println(list.size());
				
				//��� ���� clear() 
				list.clear();
				System.out.println(list.size());
				//��Ұ� �ϳ��� ������ Ȯ�� isEmpty();
				System.out.println(list.isEmpty());
	}

}
