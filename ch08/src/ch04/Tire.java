package ch04;

public interface Tire {
 public void roll();
}

class HankookTire implements Tire{
	@Override
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");	
	}	
}
class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�.");	
	}	
}