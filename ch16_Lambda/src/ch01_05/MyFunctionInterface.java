package ch01_05;


@FunctionalInterface
public interface MyFunctionInterface {
  public void method();
}

class UsingThis{
	public int outterField=10;
	
	class Inner{
		int innerField = 20;
		
		void mehtod() {//�������̽�Ÿ�� ���� = ��ü(�ڽ�)��ü(instance)�� ������ ���θ�� 
			MyFunctionInterface fi
		  = new MyFunctionInterface() {
				//int innerField=20;
			@Override
			public void method() {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis.this.outterField);
			 
			 System.out.println("innerField:"+innerField);
			// System.out.println("innerField:"+this.innerField);//���ٺҰ�
			}
		};
		fi.method();
		}
	}//InnerŬ���� ��.
	
	class MyIn implements MyFunctionInterface{
		//int innerField
		@Override
		public void method() {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis.this.outterField);
			 
			// System.out.println("innerField:"+innerField);
			// System.out.println("innerField:"+this.innerField);//���ٺҰ�
		}
	}
	
}