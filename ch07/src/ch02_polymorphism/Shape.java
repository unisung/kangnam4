package ch02_polymorphism;

public class Shape {
//�ʵ�
  public Shape next;
 //������
  public Shape() { next=null; }
 //�޼ҵ�
  public void draw() 
   {System.out.println("Shape");}
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
	{System.out.println("Circle");}
}
