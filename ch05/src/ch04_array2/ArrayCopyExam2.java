package ch04_array2;

public class ArrayCopyExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] oldStrArray = {"java","array","copy"};
   String[] newStrArray = new String[5];//[null][null][null][null][null]
   
   //System.arrayCopy()
   //arraycopy(�ҽ�,�ҽ��ǽ���index,Ÿ��,Ÿ���ǽ���index,������ ����)
   System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);

   for(int i=0;i<newStrArray.length;i++)
	    System.out.print(newStrArray[i]+" ");
   
   System.out.println("\n-----------------------");
   //java.lang.ArrayIndexOutOfBoundsException: �ҽ��� ������ 2���ε� ������ ���̸� 3���� �ϸ� �����߻�
   System.arraycopy(oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);
   for(int i=0;i<newStrArray.length;i++)
	    System.out.print(newStrArray[i]+" ");
   
  
   
   
   
   
   
   
  
		
	}
}
