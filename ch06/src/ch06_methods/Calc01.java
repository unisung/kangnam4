package ch06_methods;

public class Calc01 {
 //�ʵ�
 int i=0,j=0;
 //��1(�Ű�����O,����Ÿ��O)
 public int add(int x, int y) {
	 return x+y;
 }
 //������2(�Ű�����X,����Ÿ��O)
 public int divid() {
	 return i/j;     
 }
 //����3(�Ű�����O,����Ÿ��X)
 public void sub(int x, int y) {
	 System.out.println(x-y);
 }
 //���ϱ�4(�Ű�����X,����Ÿ��X)
 public void mul() {
	 System.out.println(i*j);
 }
 
}
