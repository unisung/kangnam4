package ch06_break;

public class BreakOutterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// charŸ�� 
	Outter:	for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
			   System.out.println(upper+"-"+lower);
				if(lower=='g')
					break Outter;
			}
		}
		
		System.out.println("���α׷� ���� ����");
	}

}
