package ch02_Arrays;

import java.util.Arrays;

public class ArraysExam {
public static void main(String[] args) {
	char[] arr1 = {'J','A','V','A'};
	
	//copyOf(����,�����ұ���)
	char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	
	//��� -���ڿ��� ���
	System.out.println(Arrays.toString(arr2));
	
	char[] arr3 = Arrays.copyOfRange(arr1, 1,3);// 1<=����<3
	System.out.println(Arrays.toString(arr3));
	
	char[] arr4 = new char[arr1.length];
	System.arraycopy(arr1, 0, arr4, 0, arr1.length);
    for( char c:arr4) {
    	System.out.print(c);
    }
	
}
}
