package verify;

public class Ex4 {
public static void main(String[] args) {
	System.out.println("4.Member Ŭ������ �ۼ��ϵ�, Object�� toString() �޼ҵ带 "
			   + "�������̵��ؼ� MemberExampleŬ������ ���� ���ó�� �������� �ۼ��غ��ÿ�.");
	Member member = new Member("blue","���Ķ�");
	System.out.println(member);//toString()�ڵ� ȣ��
}
}

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id+": "+name;
	}

}