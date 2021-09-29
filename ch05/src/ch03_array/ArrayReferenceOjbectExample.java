package ch03_array;

/* p.167 */
public class ArrayReferenceOjbectExample {
  public static void main(String[] args) {
	 String[] strArray = new String[3];
	 
	 //�迭�� ����� ������ü�� �ּҰ� ������ ��/ ������ ���� �� ��
	 //StringŸ�� ��ü ���� 1. ���� = "���ڸ��ͷ�";   2.����=new String("���ڸ��ͷ�")
	 // "Java" ->��ü�� ���� 
	 strArray[0] = "Java";
	 strArray[1] = "Java";
	 //new String("Java") ��ü ����
	 strArray[2] = new String("Java");
	 
	 //���� ��ü ��������Ȯ�� ���� ==
	 System.out.println(strArray[0]==strArray[1]?"������ü ����":"�ٸ���ü ����");//true
	 System.out.println(strArray[0]==strArray[2]?"������ü ����":"�ٸ���ü ����");//false
	 
	 //�����ϰ� �ִ� ��ü�� ������ ������ ���ϴ� ��� - equals()�޼ҵ带 ����Ѵ�.
	 //���� ����(quivalence) ��
	 System.out.println(strArray[0].equals(strArray[1])?"�����ϴ� ��ü�� ������ ����":"�����ϴ� ��ü�� ������ �ٸ���");//true
	 System.out.println(strArray[0].equals(strArray[2])?"�����ϴ� ��ü�� ������ ����":"�����ϴ� ��ü�� ������ �ٸ���");//false
	 
	 //�����ϰ� �ִ� ��ü�� ������ �����Ƿ� hashCode()���� ����
	 System.out.println(strArray[0].hashCode());
	 System.out.println(strArray[1].hashCode());
	 System.out.println(strArray[2].hashCode());
	 
	 //������ ��������� �����ּ� Ȯ��
	 System.out.println(System.identityHashCode(strArray[0]));
	 System.out.println(System.identityHashCode(strArray[1]));
	 System.out.println(System.identityHashCode(strArray[2]));
	 
	 
	 
	 
	 
	 
}
}
