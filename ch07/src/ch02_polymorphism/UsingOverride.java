package ch02_polymorphism;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		///��ũ�� ����Ʈ ���� [][][][][]
		start=new Line();
		last =start;
		obj=new Rect();
		last.next=obj;
		last=obj;
		obj=new Line();
		last.next=obj;
		last=obj;
		obj=new Circle();
		last.next=obj;
		//Cricle()��ü�� next�� null
		//��� ���� ���
		Shape p=start;
		while(p!=null) {
			p.draw();//
			p=p.next;
		}
		
		

	}

}
