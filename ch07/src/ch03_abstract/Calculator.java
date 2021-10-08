package ch03_abstract;
//추상클래스
public abstract class Calculator {
  public abstract int add(int a, int b);
  public abstract int substract(int a, int b);
  public abstract double average(int[] a);
}

class Calc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
       for(int i:a) {
    	   sum+=i;
       }
		return sum/a.length;
	}
}