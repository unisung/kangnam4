package ch02_Objects_isNull;

import java.util.Objects;

public class NullEx {
public static void main(String[] args) {
	String s1="ȫ�浿";
	String s2=null;
	
	System.out.println(Objects.requireNonNull(s1));
	//System.out.println(Objects.requireNonNull(s2));//���ܹ߻�
	
	//null����Ȯ��
	System.out.println(Objects.isNull(s1));
	System.out.println(Objects.isNull(s2));
}
}
