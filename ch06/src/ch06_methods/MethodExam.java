package ch06_methods;

public class MethodExam {
		//1. �Ű����� �ְ�, ����Ÿ���ִ� �޼ҵ�
	    // - �Ű��������� �޾Ƽ� ó���ϰ� ����� �ٽ� �ش縮��Ÿ������ �ǵ����� �� ���.
	     int sum(int x, int y) {
	    	 return x+y;
	     }
		//2. �Ű����� ����, ����Ÿ���ִ� �޼ҵ�
	    // - ȣ��� ������� �ǵ����ִ� ��� ���
	     String greeting() {
	    	 return "hello";
	     }
		//3. �Ű����� �ְ�, ����Ÿ�� ���� �޼ҵ�(void)
	    // - �Ű������� �ް� �ش� �޼ҵ峻���� ó���ϰ� ����� �ǵ��� ���� ���� �� ���.
	    void sumVoid(int x, int y) {
	    	System.out.println("result="+(x+y));
	    }
		//4. �Ű����� ����, ����Ÿ�� ���� �޼ҵ�(void)
	    //-ȣ��� �޼ҵ峻���� ó���ϰ� ����� �ǵ������� �ʴ� ��� ���.
	    void greetingVoid() {
	    	System.out.println("hi");
	    }
}
