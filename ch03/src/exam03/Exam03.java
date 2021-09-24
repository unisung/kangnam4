package exam03;
/* 삼항 연산 */
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		String result = (!(score>90))? "가":"나";// !false =true
		System.out.println(result);//"가"
	}

}
