package ch02_polymorphism;

public class Shape {
//필드
  public Shape next;
 //생성자
  public Shape() { next=null; }
 //메소드
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
