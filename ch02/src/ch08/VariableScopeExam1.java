package ch08;

public class VariableScopeExam1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //main�޼ҵ� �������� ����� ���ú���
	  int var1=0;
      
      if(true) {
    	  //main�޼ҵ峻�� if������ ����� ���ú���
    	  int var2;
    	  System.out.println(var1);
    	  var1 = 1;// main�޼ҵ� ���� if�������� ��밡��.
    	  var2 = 2;//�ڽ��� ����� �������� ��밡��
    	  int result = var1 + var2;
    	  System.out.println(result);
      }
      while(true) {
    	  //main�޼ҵ峻�� while������ ����� ���ú���
    	  int var3;
    	  System.out.println(var1);//main���� ����ǰ� if������ ���� �ٲ� ����
    	  var3=3;
    	  var1=4;//while������ ���ο� �� ���� 
    	  System.out.println(var1+var3);
    	  //
    	 //  var2=5;
    	  break;//�ݺ����� ���������� �ϴ� ��ɾ�
      }
      System.out.println(var1);
     // System.out.println(var2);
     // System.out.println(var3);
	}
}
