package ch01_05;


@FunctionalInterface
public interface MyFunctionInterface2 {
  public void method();
}

class UsingThis1{
	public int outterField=10;
	
	class Inner{
		int innerField = 20;
		
		void method() {//�������̽�Ÿ�� ���� = ��ü(�ڽ�)��ü(instance)�� ������ ���θ�� 
			MyFunctionInterface2 fi
		  = () -> {
			 System.out.println("outterField:"+outterField);
			 System.out.println("outterField:"+UsingThis1.this.outterField);
			 
			 System.out.println("innerField:"+innerField);
			 System.out.println("innerField:"+this.innerField);//���ٺҰ�
		  };
		fi.method();
		}
	}//InnerŬ���� ��.
}