package NaNAndInfinity;

import java.util.Scanner;

import java.util.Scanner;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///���ڰ� �ƴ� NaN�� �Է¹޾Ƽ� ���� ó��
		String userInput;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ǽ��� �Է��ϼ���");
		userInput = scanner.next();
		
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(Double.valueOf(userInput))) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
		}else {
			currentBalance += val;
			System.out.println(currentBalance);
		}

	}
}
