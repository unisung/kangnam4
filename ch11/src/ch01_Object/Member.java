package ch01_Object;

//thread, collection, network, file�����, 
public class Member {
   public String id;

public Member(String id) {
	this.id = id;
}

//Object�� ���� ��ӹ���
//equals�޼ҵ� �������Ͽ� ���� ���� ���� �����
@Override
public boolean equals(Object obj) {
	//�񱳽�
	//���� Ÿ���� �ƴϸ� false
	if(obj instanceof Member) {
		//���� Ÿ�̸� id�� ���� ���� ��� true/false
		Member other= (Member)obj;
		return this.id.equals(other.id);
		//return this.id.equals(((Member)obj).id);		
	}
	return false;
}
   
}
