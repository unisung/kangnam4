package ch04;

import java.util.HashSet;
import java.util.Set;

public class CustomerMain {
public static void main(String[] args) {
	 Set<Customer> set = new HashSet<>();
	 set.add(new Customer(1, "ȫ�浿", "�����", "010-111-1234"));
	 set.add(new Customer(2, "ȫ�浿", "������", "010-111-4567"));
	 set.add(new Customer(3, "�Ӳ���", "�����", "010-111-1234"));
	 set.add(new Customer(1, "������", "��õ��", "010-111-1234"));
	 set.add(new Customer(4, "ȫ�浿", "������", "010-111-4567"));
	 set.add(new Customer(1, "ȫ�ڸ�", "��õ��", "010-111-1234"));
	 
	 System.out.println(set);
	
}
}
