package verify;

import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {
	System.out.println("10.ù ��°�� ���ĺ����� �����ϰ� �� ��°���� ���ڿ� ���ĺ����� ������ 8��~12�� "
			+ " ������ ID\r\n"
			+ "������ �˻��ϰ� �ͽ��ϴ�. ���ĺ��� ��ҹ���[a-zA-Z]�� ��� ����� ��쿡 ���� ǥ������ �̿��ؼ� ����\r\n"
			+ "�ϴ� �ڵ带 �ۼ��غ�����.");
	
     String id="5Angel1004";
     String regExp="[a-zA-Z][a-zA-Z0-9]{8,12}";
     boolean isMatch = Pattern.matches(regExp, id);
     if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
}
}
