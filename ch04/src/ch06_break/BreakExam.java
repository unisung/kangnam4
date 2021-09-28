package ch06_break;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 	for(int i=1;i<10;i++) {
			if(i==2) break;
			for(int j=1;j<=10;j++) {
				 if(j==3)break;
				for(int k=1;k<=10;k++) {
					System.out.print("i="+i+",j="+j+",k="+k);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
