package ch01_Object.copy.copy;

public class MemberEx1 {
	public static void main(String[] args) {

    //������ �ٸ� ��ü 
     Member member1 = new Member("ȫ�浿",18);
     Member member2 = new Member("ȫ�浿",18);
     Member member3 = new Member("ȫ�浿",35);
     
     //���� ����-������ ������ ������ ��ü�� ó��
     System.out.println(member1.equals(member2));
     System.out.println(member1.equals(member3));
	}
}
