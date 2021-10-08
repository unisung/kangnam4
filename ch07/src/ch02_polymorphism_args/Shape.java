package ch02_polymorphism_args;

public class Shape {
	public Shape next; 
	public Shape() { next = null; }

	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}