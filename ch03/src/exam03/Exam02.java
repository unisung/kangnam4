package exam03;

public class Exam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		//연산식에 증/감 연산 포함.
		int z = (++x) + (y--);//x=11, y=19, z=31,
		System.out.println(z); 
		System.out.println(y); 
		System.out.println(x); 
	}
}
