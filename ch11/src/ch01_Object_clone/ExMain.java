package ch01_Object_clone;

public class ExMain {
public static void main(String[] args) {
	//������ü
	int[] scores= {90,90};
	Car car = new Car("�ҳ�Ÿ");
	B original = new B("ȫ�浿", 25, scores,car);
	//���� ����
	B cloned = original.getB();
	
	//������ ����
	cloned.scores[0]=100;
	cloned.car.model="�׷���";
    
	//���� ���濩�� Ȯ��
    System.out.println("[���� ��ü�� �ʵ尪]");
    System.out.println(cloned.car.model);
    for(int i=0;i<cloned.scores.length;i++)
    	System.out.println(cloned.scores[i]);
    System.out.println("[���� ��ü�� �ʵ尪]");
    System.out.println(original.car.model);
    for(int i=0;i<original.scores.length;i++)
    	System.out.println(original.scores[i]);	
    
    String[] a= {"������","�ȷ���","ĥ����"};
    String[] b= new String[a.length];
    for(int i=0;i<a.length;i++)
    	 b[i]=new String(a[i]);
    
    b[0]=new String("������");
    b[1]=new String("�ȷ���");
    b[2]=new String("ĥ����");
}
}
