package ch03_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapEx04 {
public static void main(String[] args) {
	// 1,"ȫ�浿", 2,"������", 3, "�Ӳ���" 2,"�̼���"
	// ���� �����ϴ� Map�� ����� ,���� �� 
	// ����� ��ü�ǰ��� Ȯ��
	// Map���� 3�� Ű�� �ش��ϴ� ��ü�� ����غ�����.
	//Map<Integer,String> members =new HashMap<>();
	Map<Integer,String> members =new Hashtable<>();
	
	members.put(1, "ȫ�浿");//�⺻Ÿ�� int ->Integer�� AutoBoxing
	members.put(new Integer(2), "������");
	members.put(new Integer("3"), new String("�Ӳ���"));
	members.put(2,"�̼���");//int -> Integer
	
	System.out.println(members.size());
	
	System.out.println(members.get(3));//AutoBoxing
	
	System.out.println(members.get(2));//AutoBoxing
	
	
}
}