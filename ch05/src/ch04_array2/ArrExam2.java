package ch04_array2;

import java.util.Scanner;

public class ArrExam2 {
 public static void main(String[] args) {
  //����ǥ ���α׷�
  //��ĳ�ʷ� ���� �Է¹ޱ� int[] score = {76,45,34,89,100,50,90,92}; 
  // int[] scores=new int[8];
  //�Է��� ������ �հ�, ���, ������ ����ϱ�
  // for���� ���� for������ ����ϱ�
  // 1.�����Է� | 2.���(��/���)���| 3. ������ ����ϱ� | 4. ����
  //ch04 - 7�� ����.
	 //Ű����� ���� ������ �Է¹ޱ� ���� scanner��ü ����
	 Scanner scanner = new Scanner(System.in);
	 //�迭����
	 int[] scores=new int[8];
	 //�ݺ����� ���������� ���� ����
	 boolean run=true;
	 //�հ躯��
	 int sum=0;
	 while(run) {
		 System.out.println("----------------------------------------------");
		 System.out.println("1.�����Է�|2.���(��/���)���|3.������ ����ϱ�|4. ����");
		 System.out.println("----------------------------------------------");
		 int menu=scanner.nextInt();
		 
  switch(menu){
  case 1: 
	     System.out.println("�����Է�>");
	     for(int i=0;i<scores.length;i++) scores[i]=scanner.nextInt();	 
	     break;
  case 2:
	   System.out.println("������>");
	    for(int i:scores)  sum+=i;
        System.out.println("�����հ�:"+sum);
        System.out.println("�������:"+(sum/(double)scores.length));
	     break;
  case 3:
	     System.out.println("������ ���>");
	     int temp=0;//���� �ٲٱ� �� �ӽ� ���庯��
	     for(int i=0;i<scores.length;i++) {
	    	 for(int j=i+1;j<scores.length;j++) {
	    		 if(scores[i] < scores[j]) {//���������� �������� �ڷ� �����ϴµ� �������� �տ� ������ �ڷ� �̵���Ŵ.
	    			 temp = scores[i];//�ӽ�����
	    			 scores[i]=scores[j];//���� ���� ������ �̵�
	    			 scores[j]=temp;//���� ���� �ڷ� �̵�.
	    		 }
	    	 }//���� for��
	     }//�ٱ��� for��
	     
	     for(int i:scores)   	
	    	 System.out.print(i+", ");
	     System.out.println();
	     break;
  case 4: run = !run;
  }
	}//�ݺ���
	 System.out.println("����");
}
}
