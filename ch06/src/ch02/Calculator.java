package ch02;

//public Ű����� �ܺο��� ���ٰ����� ���� ��������.
public class Calculator {
	//model���� �ܺο��� ���ٰ���, �����Ǹ� �ȵ�.
	public final String model="00001";
	//result���� getCalc�� ���ؼ� ó���� ���� ����.�ܺο��� ���ٺҰ�
    private double result=0;
    //���� Ŭ�������� �޼ҵ�鳢���� ��ȣ ȣ�� ����
    private String resultNumer="";
  public void getCalc(String user, String op, int x, int y) {
	    if(user.equals("admin")) {
	    	resultNumer="99999";
	    }else {
	    	resultNumer="00000";
	    }
		switch(op) {
		case "+": result =add(x,y);
			      System.out.println(result); break;
		case "-": result = sub(x,y);
			      System.out.println(result); break;
		case "x": result = mul(x,y);
			      System.out.println(result); break;
		case "/": result = div(x,y);
			      System.out.println(result); break;
		}
		System.out.println(resultNumer);
	}
   //�Ʒ��� �޼ҵ��� getCalc()�޼ҵ常 ȣ�Ⱑ��-�ܺο��� ȣ��Ұ�
   private int add(int x, int y) { return x+y; }
   private int sub(int x, int y) { return x-y; }
   private int mul(int x, int y) { return x*y; }
   private double div(int x, int y) { return x/(double)y; }
}
