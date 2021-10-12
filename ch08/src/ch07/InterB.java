package ch07;

public interface InterB extends InterA{
	//추상메소드로 재정의
  void method2();
}
class B implements InterB{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
    //추상메소드로 재정의 되었슴.
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}