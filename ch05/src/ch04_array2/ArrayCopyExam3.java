package ch04_array2;

public class ArrayCopyExam3 {

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
   //java.lang.ArrayIndexOutOfBoundsException: �ҽ��� ������ 2���ε� Ÿ�ٹ迭�� �ε�����ȣ�� �ʰ��� �����߻�
   System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
   for(int i=0;i<newStrArray.length;i++)
	    System.out.print(newStrArray[i]+" ");
   
   System.out.println();
   int srcPos = 1;
   int num = oldStrArray.length - srcPos;//3-1=2
   System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
   for(int i=0;i<newStrArray.length;i++)
	    System.out.print(newStrArray[i]+" ");
  
   
   
   
   
   
   
  
		
	}
}
