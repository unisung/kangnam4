package ch07_singleton_01;

public class ExMain {
	public static void main(String[] args) {
	//multiton��� - new ������();
	 //SingleTon s1 = new SingleTon();
     //SingleTon s1 = SingleTon.instance;
	 //Ŭ������.static�޼ҵ�ȣ��()
      SingleTon s1 = SingleTon.getInstance();
      SingleTon s2 = SingleTon.getInstance();
     
      System.out.println(s1==s2?"������ü":"�ٸ���ü");
      
	}
}
