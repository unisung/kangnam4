package ch02_Arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		//�⺻ Ÿ�� �˻�
		int[] scores= {99,97,98};
		//binary�� sort�Ŀ� ���
		Arrays.sort(scores);//97,98,99
		int index =Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���:"+index);
		
	  //��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members= {m1,m2,m3};
		//sort�� binarySearch()�޼ҵ� ���.
		Arrays.sort(members);//��μ�, �ڵ���, ȫ�浿
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���:"+index);
		System.out.println(members[index].name);
		
	}
}
