package ch07_initialBlock;

public class Init2Ex {
	public static void main(String[] args) {
		//a�� static��� Ŭ������.static�ʵ�� ����
	 for(int i: Init2.a) {
		 System.out.println(i);
	 }
	}
}
class Init2{
	static int[] a=new int[5];
	//static �ʱ�ȭ �� - static{} 
 static{
		for(int i=0;i<a.length;i++) {
			int k=(int)(Math.random()*10);
			a[i]=k;
		}
	}
	
}