package ch01_06;

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}
class Point{
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public Point() { 	this.x = this.y = 0; 	}
	public Point(int x, int y) { 		this.x = x; this.y = y;	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}
class ColorPoint extends Point{
	private String color; // ���� ��
	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color); 	showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

