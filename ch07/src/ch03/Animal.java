package ch03;

public class Animal {
    void run() {
    	System.out.println("�̵��մϴ�");
    }
    
  public static void main(String[] args) {
	// ��ü(��ü)�� ����  
	Animal a = new Animal();
	Fish f=new Fish();
	Bird b=new Bird();
	Insect i=new Insect();
	a.run();
	f.run();
	i.run();
}  
}

class Fish extends Animal{
	void run() {
		System.out.println("���Ĩ�ϴ�.");
	}
}
class Bird extends Animal{
	void run() {
		System.out.println("���ư��ϴ�.");
	}
}
class Insect extends Animal{
	//�޼ҵ� ������ ����.
}
