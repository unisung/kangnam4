package ch02;

import java.util.function.IntSupplier;

//supplier����
public class SupplierExample {
public static void main(String[] args) {
	 IntSupplier intSupplier = new IntSupplier() {
		@Override
		public int getAsInt() {
			int num =(int)(Math.random()*6)+1;//1~6 ���� ���� ����
			return num;
		}
	};
	System.out.println(intSupplier.getAsInt());
	
	//���ٽ�
	intSupplier = ()->(int)(Math.random()*6)+1;
	System.out.println(intSupplier.getAsInt());
}
}
