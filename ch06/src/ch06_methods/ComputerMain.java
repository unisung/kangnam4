package ch06_methods;

public class ComputerMain {
	public static void main(String[] args) {
     Computer c1 = new Computer();
     //�Ű����� ������ ���������� ���ް���.
     int result1=c1.sum2(1);
     int result2=c1.sum2(1,2,3,4,5);
     int result3=c1.sum2(10,20);
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);

	}
}
