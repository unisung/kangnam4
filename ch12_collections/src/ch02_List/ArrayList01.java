package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
public static void main(String[] args) {
	//List �������̽� Ÿ���� �������� = ArrayList��ü ����
	List<String> list = new ArrayList<>();
	//��ü �߰� �޼ҵ� add(��ü);
	list.add("Hello");
	list.add("hi");
	list.add("Java");
	
	//��ü�� ���� Ȯ�� size()
	int n = list.size();
	//int c = list.capacity(); -����
	System.out.println(n);
	
	//�߰� ���� add(index,��ü)
	list.add(2, "Shani");
	//list.add(5,"Shani");//java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
	
	//����� ��ü ��� get(index)
	String str = list.get(1);
	System.out.println(str);
	
	//���� remove(index��ȣ)
	list.remove(1);
	//size()������ ū index��ȣ�� ������ ���� �߻�
	//list.remove(4);//java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
	
	
	
	
	
	
	
	
	
	
	
}
}
