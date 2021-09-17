package exam;

public class work01 {
	public static void main(String[] args) {
		
		// 제지방량 구하기
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//제지방량
		double result = ST1 * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// 체지방량 구하기
		double result2 = weight - result;

		System.out.println(result2);

		// 체지방률 구하기 = 체지방량*100/체중
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

		System.out.println(result3);
	}
}
