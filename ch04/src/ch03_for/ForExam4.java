package ch03_for;

public class ForExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=0;i<10;i++) {
    	 System.out.print(i+"\t");//print() ���ٷ� �̾ ���
     }
     System.out.println();//���� �Ʒ��� ����, ����� �����ٷ� �̵�->�����ٷ� �̵�����
	
     for(int i=0;i<10;i+=2) {// i = i+2;
      System.out.print(i+"\t");
     }
     
     System.out.println();//���� �Ʒ��� ����
     for(int i=0;i<10;i+=3) { // i=i+3;
         System.out.print(i+"\t");
        }
     System.out.println();//���� �Ʒ��� ����
     for(int i=1;i<100;i*=2) { // i=i*2
         System.out.print(i+"\t");
        }
     
     System.out.println();//���� �Ʒ��� ���� 
     for(int i=10;i>0;i--) { // i=i-1, --i,
         System.out.print(i+"\t");
        }
     
     System.out.println();//���� �Ʒ��� ���� 
     for(int i=10;i>10;i--) { //  �ʱ�ȭ �� i>10 �񱳿����� false�̹Ƿ� ��{}���� ����.
         System.out.print(i+"\t");
        } 
     System.out.println();
     System.out.println("����");
     
	}
}
