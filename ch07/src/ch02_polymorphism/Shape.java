package ch02_polymorphism;

public class Shape {
//�ʵ�
  public Shape next;
  protected String name;
 //������
  public Shape() { next=null; }
 //�޼ҵ�
  public void draw() 
   {System.out.println("Shape");}
  
  public void paint() {  draw(); }
}

class Line extends Shape{
	public void draw() 
	{System.out.println("Line");}
}
class Rect extends Shape{
	public void draw() 
	{System.out.println("Rect");}
}
class Circle extends Shape{
	public void draw()
	{ name="Circle";//�ڽ�Ŭ�������� ���Ҵ�� ��
	  System.out.println("Circle");
	  super.name="Shape";//�θ��ʵ� ���� - �������ε�
	  super.draw();//�θ�޼ҵ�ȣ�� -�������ε�
	  System.out.println(name);
	}
}
