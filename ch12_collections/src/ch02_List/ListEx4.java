package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {
public static void main(String[] args) {
	//List  StringŸ�� "ȫ�浿","������"","�Ӳ���", IntegerŸ�� 10,20,30
	//�� ���� �����ϴ� List����� ������ ��� ���� ��, ���
	List list = new ArrayList();
	list.add("ȫ�浿");// String -> Object
	list.add("������");
	list.add("�Ӳ���");
	list.add(10); //Integer ->Object
	list.add(20);
	list.add(30);
	
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));// Object -> String/Integer

}
}
