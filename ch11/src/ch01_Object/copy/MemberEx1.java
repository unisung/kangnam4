package ch01_Object.copy;

public class MemberEx1 {
	public static void main(String[] args) {

    //������ �ٸ� ��ü 
     Member member1 = new Member(2001001);
     Member member2 = new Member(2001001);
     
     //���� ����-������ ������ ������ ��ü�� ó��
     System.out.println(member1.equals(member2));
	}
}
