package ch02_List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
public static void main(String[] args) {
	//1.String��ü�� ��� LinkdedList�� List�� ����� 
     List<String> list = new LinkedList<>();
    //2."ȫ�浿", "������", "�Ӳ���" �� ���� ��
     list.add("ȫ�浿");list.add("������");list.add("�Ӳ���");
	//3.����� ������ �����ϵ��� �ۼ�
     System.out.println(list.size());
	//4. "�̼���"�� ����ִ��� Ȯ��
     System.out.println(list.contains("�̼���"));
     
     
	//5. ��� ��ü�� ��� [a][a][null][a][null][a]
	 for(int i=0;i<list.size();i++)
	     System.out.println(list.get(i));
	 
	 //10.
	 list.sort(new Comparator<String>() {
		 @Override
		 public int compare(String o1, String o2) {
			 return o1.compareTo(o2);
		 }
	 });
	 System.out.println("---------------");
	 for(int i=0;i<list.size();i++)
		 System.out.println(list.get(i));
	 System.out.println("---------------"); 
	 
			//6. index��ȣ 2���� �ش��ϴ� ��ü�� "������"���� �����ϼ���.
       list.set(2,"������");
			
			System.out.println("-----------------------");
			//7. index��ȣ 2���� �ش��ϴ� ��ü�� ����ϼ���
     System.out.println(list.get(2));	
			//8. ����Ʈ���� ��� ��ü�� ������  
      list.clear();
			//9. ����Ʈ�� ����ִ��� Ȯ�� �޼����� ���
      System.out.println(list.isEmpty());
      
      
      
}
}
