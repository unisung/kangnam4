package ch02_Wrapper;

public class WrapperEx {
public static void main(String[] args) {
	//boxing  
	Integer obj1 = new Integer(10);
	Integer obj2 = new Integer("10");
	//auto-boxing
	Integer obj3 = 10;
	
	//unboxing
	int i1=obj1.intValue();
	int i2=obj2.intValue();
	
	//autoUnboxing
	int i3 = obj3;
	
	//�� �񱳽� equals()�޼ҵ� ����ϰų�, unboxing�Ͽ� �⺻Ÿ������ ������ �񱳿����� ���
	System.out.println(obj1.equals(obj3));
	System.out.println(i1==i3);
	  
}
}
