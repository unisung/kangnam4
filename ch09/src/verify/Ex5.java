package verify;

public class Ex5 {
	Vehicle field=new Vehicle() {
		@Override
		public void run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
		}};
		
	void method1() {
		//����
		  Vehicle localVar = new Vehicle() {
				@Override
				public void run() {
					System.out.println("�¿����� �޸��ϴ�.");
				}};
		  //�޼ҵ� ȣ��
		  localVar.run();
	  }
    void method2(Vehicle v) {
    	v.run();
    }
	  
public static void main(String[] args) {
     Ex5 annoy = new Ex5();
     annoy.field.run();
     annoy.method1();
     annoy.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}});
}
}

interface Vehicle{
	void run();
}