package ch07_staticVsnotStatic;

public class CalcultorMain {
public static void main(String[] args) {
	//static��� - Ŭ������.�ʵ�
	System.out.println(Calculator.pi);
	
	//Ŭ������.�޼ҵ��(��);
	int result1 = Calculator.plus(10, 20);
	int result2 = Calculator.minus(10, 20);
	System.out.println(result1);
	System.out.println(result2);
	
	//static �ɹ��� �Ʒ��� ���� ���� ��
	Calculator c =new Calculator();
    //c.pi;
	//c.plus(10,20);
	//c.minus(20,30);
	
}
}
