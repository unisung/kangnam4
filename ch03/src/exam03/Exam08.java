package exam03;

public class Exam08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double x = 5.0;
     double y = 0.0;
     
     double z1 = x/y;// 5.0 / 0.0 ��
     double z = x%y;// 5.0 / 0.0������? ������ , ���� 0���� ������?
     
     System.out.println(z1);
     System.out.println(z);//���ڷ� ǥ�� �Ұ� NaN, Null, String ������ NaN, Null, String
		
      if(Double.isNaN(z)) {
    	  System.out.println("0.0���� ���� �� �����ϴ�.");
      }else {	  
	   double result = z +10; //NaN + 10 => NaN
	  //������ ���� ������ ����� ������ �ʴ� ��� �߻�
	  System.out.println("���: "+result);
      }		 
	}
}
