package verify;

/* MemberŬ����,
 * ȸ���� �����ʹ� �̸�, ���̵�, �н�����, ���� */
public class Ex13 {
	public static void main(String[] args) {
		Member user1 = new Member("ȫ�浿","hong");
		//default�����ڸ� ȣ���Ͽ� ��ü�� �����Ϸ���
		//Ŭ������ default�����ڸ� �߰����־����.
		Member user2 = new Member();
		user2.setId("java");
		user2.setName("���ڹ�");
	}	
}
class Member{
	//�ʵ�
	private String name;
	private String id;
	private String password;
	private int age;
	
	//������ - Ex14
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	//default������ 
	public Member() {}
	
	//�޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
