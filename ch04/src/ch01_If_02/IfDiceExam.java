package ch01_If_02;

/* �ֻ���(dice) 1~6 ���� ���� �ֻ��� */
public class IfDiceExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		 // 0+1 <=(int)(Math.random()*6)+1 <6+1
		
		num = (int)(Math.random()*6)+1;//1,2,3,4,5,6 �߿� �ϳ��� �� ���
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else //if(num==6) {
			System.out.println("6���� ���Խ��ϴ�.");
		
		

	}
}
