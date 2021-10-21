package ch02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+"8");
			}
		};
		
		consumer.accept("�ڹ�");
		
		//���ٽ�
		consumer = t->System.out.println(t+"8");
		consumer.accept("�ڹ�");
		
		BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
			@Override
			public void accept(String t, String u) {
				System.out.println(t+u);
			}
		};
		biConsumer.accept("�ڹ�", "8");
		//���ٽ�
		biConsumer =(t,u)->System.out.println(t+u);
		biConsumer.accept("�ڹ�","8");
		
		DoubleConsumer doubleConsumer = new DoubleConsumer() {	
			@Override
			public void accept(double value) {
				System.out.println("�ڹ�"+value);
			}
		};
		doubleConsumer.accept(8);
		
		doubleConsumer = v->System.out.println("�ڹ�"+v);
		doubleConsumer.accept(8);
		
		ObjIntConsumer<String> objIntConsumer = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println(t+value);
			}
		};
		objIntConsumer.accept("�ڹ�", 8);
		//���ٽ�
		objIntConsumer=(t,v)->System.out.println(t+v);
		objIntConsumer.accept("�ڹ�",8);
		
		

	}

}
