package ch01_Object;

public class MemberEx1 {
	public static void main(String[] args) {
	//String��ü�� ���ڿ��� ������ ���ü�� ó��
	String str1=new String("ȫ�浿");
	String str2=new String("ȫ�浿");
	//���� ����
	System.out.println(str1.equals(str2));
    //������ �ٸ� ��ü 
     Member member1 = new Member("ȫ�浿");
     Member member2 = new Member("ȫ�浿");
     Student stuent = new Student("ȫ�浿");
     
     //���� ����-������ ������ ������ ��ü�� ó��
     //
     System.out.println(member1.equals(member2));
     
     
	}
}
