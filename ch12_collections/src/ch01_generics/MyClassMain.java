package ch01_generics;

public class MyClassMain {
	public static void main(String[] args) {
		//�����Ͻ� T -> Integer�� ��ȯ
		MyClass<Integer> s=new MyClass<Integer>();
		s.set(10);//10 -> Integer10���� autoBoxing�Ǿ� ��
		s.set(new Integer(10));
		System.out.println(s.get());
		
		//�����Ͻ� T ->String���� ��ȯ
		MyClass<String> s1=new MyClass<String>();
		s1.set("hello");
        System.out.println(s1.get());
        
		MyClass<Double> s2=new MyClass<Double>();
		s2.set(10.0);//10 -> Integer10���� autoBoxing�Ǿ� ��
		s2.set(new Double(10.0));
		System.out.println(s2.get());
		
	}
}
