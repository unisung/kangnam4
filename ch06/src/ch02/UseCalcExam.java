package ch02;

public class UseCalcExam {
 public static void main(String[] args) {
	 //��ü ����
	 Calculator cal = new Calculator();
	 cal.getCalc("user","+", 10, 20);
	 //�ܺο��� ���� ����
	 System.out.println(cal.model);
	 //�ܺο��� ���ٺҰ�
	 //System.out.println(cal.result);
	 //�ܺο��� ���ٺҰ�
	  //int res = cal.sub(10,20);
	 //cal.result=cal.sub(10, 20);
	 //System.out.println(cal.result);
	 //�ܺο��� ���� �Ұ�
	 // cal.model="99999";
	 System.out.println(cal.model);
	
}
}
