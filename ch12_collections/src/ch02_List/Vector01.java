package ch02_List;

import java.util.List;
import java.util.Vector;

public class Vector01 {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer>(7);
	//List<Integer> v = new Vector<Integer>(7);
	//System.out.println(v.capacity());
	//��һ���
	v.add(5);
	v.add(new Integer(4));
	v.add(-1);
	
	//����� ���� size()
	System.out.println(v.size());
	
	//�߰� ����
	v.add(2,100);
	//v.add(5,100);//java.lang.ArrayIndexOutOfBoundsException: 5 > 4
	
	//��ü ���
	for(int i=0;i<v.size();i++)
		System.out.println(v.get(i));
	
	//��� ���
	Integer obj = v.get(1);
	int i=obj.intValue();
	System.out.println(i);
	
	int j=v.get(1);//auto-unboxing;
	System.out.println(j);
	
	//����
	v.remove(1);
	//v.remove(4);// java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 4
	
	//������ ���
	int last =v.lastElement();
	System.out.println(last);
	
	//����� ����
	v.removeAllElements();
	
	//����ִ��� Ȯ�� isEmpty();
	System.out.println(v.isEmpty());
	
}
}
