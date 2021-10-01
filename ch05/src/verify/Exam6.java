package verify;

/* 6. 배열의 길이에 대한 문제입니다. array.length의 값과 array[2].length의 값은 얼마입니까?
 * */ 
public class Exam6 {
	public static void main(String[] args) {
		int[][] array ={ {95,86},
			             {83,92,96},
			             {78,83,93,87,88}
			            };
		System.out.println(array.length);//이차원배열 배열명.length=1차원배열의 개수(행의 수)
		System.out.println(array[2].length);//index번호 2인행의 배열의 길이(열의 수=요소수)
	}
}
