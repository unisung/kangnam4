package verify;

import java.util.Scanner;

/* 
9. ������ Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������
   ���ϴ� ���α׷��Դϴ�. ���� ����� ����, �˸°� �ۼ��غ�����.
   (����� 16���ο��� Scanner�� nextInt()�޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����մϴ�.)
 *������
	 * -------------------------------------
	 * 1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����
	 * -------------------------------------
	 * ����>1
	 * �л���>3
	 * -------------------------------------
	 * 1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����
	 * -------------------------------------
	 * ����>2
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����
	 * -------------------------------------
	 * ����>3
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����
	 * -------------------------------------
	 * ����>4
	 * �ְ� ���� : 95
	 * ��� ���� : 91.0
	 * -------------------------------------
	 * 1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����
	 * -------------------------------------
	 * ����>5
	 * ���α׷� ���� 
 * */
public class Exam9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
        	System.out.println("-------------------------------------");
        	System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
        	System.out.println("-------------------------------------");
        	System.out.println("����> ");
        	
        	int selectNo = scanner.nextInt();
        	
        	switch(selectNo) {
        	case 1: System.out.print("�л���>");
        			studentNum = scanner.nextInt(); 
        			scores = new int[studentNum];//�ʱⰪ�� ��, ����� ������ ���� Ȯ��
        			//System.out.println("������ �л� ��:"+scores.length);
        		    break;
        	case 2: for(int i=0;i<scores.length;i++) {
        		      System.out.print("scores["+i+"]>");
        		      scores[i]=scanner.nextInt();
        			 }
        	         System.out.println("�Է¿Ϸ�");
        		    break;
        	case 3: for(int i=0;i<scores.length;i++) 
		  		      System.out.println("scores["+i+"]>"+scores[i]);
        		    break;
        	case 4: int max=0,sum=0;
        	     
    				for(int i=0;i<scores.length;i++) {
    					if(scores[i] > max) max=scores[i];
    					 sum+=scores[i];
    				} 
        		    System.out.println("�ְ�����:"+max);
        			System.out.println("�������:"+sum/(double)scores.length);
        		    break;
        	case 5: run=!run;
        		    break;
        	}
        }//while�� ��.
        System.out.println("���α׷� ����");
	}
}
