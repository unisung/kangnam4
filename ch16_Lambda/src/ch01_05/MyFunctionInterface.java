package ch01_05;


@FunctionalInterface
public interface MyFunctionInterface {
  public void method();
}

class UsingThis{
	public int outterField=10;
	
	class Inner{
		int innerField = 20;
		
		void mehtod() {//인터페이스타입 변수 = 실체(자식)객체(instance)의 생성후 프로모션 
			MyFunctionInterface fi
		  = new MyFunctionInterface() {
				//int innerField=20;
			@Override
			public void method() {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis.this.outterField);
			 
			 System.out.println("innerField:"+innerField);
			// System.out.println("innerField:"+this.innerField);//접근불가
			}
		};
		fi.method();
		}
	}//Inner클래스 끝.
	
	class MyIn implements MyFunctionInterface{
		//int innerField
		@Override
		public void method() {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis.this.outterField);
			 
			// System.out.println("innerField:"+innerField);
			// System.out.println("innerField:"+this.innerField);//접근불가
		}
	}
	
}