package verify;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
public static void main(String[] args) {
	System.out.println("3.Set �÷��ǿ� ���� ���� �� Ʋ�� ���� �����Դϱ�?");
	System.out.println("1)��ǥ���� ���� Ŭ�����δ� HashSet, LinkedHashSet, TreeSet�� �ִ�.\r\n"
			+ "2)Set �÷��ǿ��� ��ü�� �ϳ��� �������� �ʹٸ� Iterator�� �̿��Ѵ�.\r\n"
			+ "3)HashSet�� hashCode()�� equals()�� �̿��ؼ� �ߺ��� ��ü�� �Ǻ��Ѵ�.\r\n"
			+ "x4)Set �÷��ǿ��� null�� ������ �� ����.");
	
	Set<String> set = new HashSet<>();
	set.add("hello");
	set.add(null);
	set.add("hi");
	//���� ����Ʈ
	System.out.println(set.toString());
	
} 
}
