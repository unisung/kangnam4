package ch05;

public class InterMain {
	public static void main(String[] args) {
	    //CA -> C -> A
		InterfaceA ia = new CA();
	    ia.methodA();
	    //interfaceA�� ���� �޼ҵ�
	    //ia.methodC();
	    
	    // CA ->C -> B
	    InterfaceB ib = new CA();
	    ib.methodB();
	    //interfaceB�� ���� �޼ҵ�
	    //ib.methodC();
	    

	}
}
