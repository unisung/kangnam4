package ch01_05;


@FunctionalInterface
public interface MyFunctionInterface2 {
  public void method();
}

class UsingThis1{
	public int outterField=10;
	
	class Inner{
		int innerField = 20;
		
		void method() {//인터페이스타입 변수 = 실체(자식)객체(instance)의 생성후 프로모션 
			MyFunctionInterface2 fi
		  = () -> {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis1.this.outterField);
			 
			 System.out.println("innerField:"+innerField);
			 System.out.println("innerField:"+this.innerField);//접근불가
		  };
		fi.method();
		}
	}//Inner클래스 끝.
}