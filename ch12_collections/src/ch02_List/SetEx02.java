package ch02_List;

public class SetEx02 {
public static void main(String[] args) {
   //Set�������̽� �� ����� set����
   //Member1 String sno, String name���� ����
   //"1","ȫ�浿"  "2","������"  "3","�Ӳ���", "2","������"
   //�ߺ������Ͽ� ���� �� ��� ��ü�� ���
	 
}
}

class Member1{
	private String sno; 
	private String name;
	public Member1(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Member1 [sno=" + sno + ", name=" + name + "]";
	}
	
	
}

