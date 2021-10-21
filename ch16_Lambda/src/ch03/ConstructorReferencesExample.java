package ch03;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
	 Function<String, Member> function = new Function<String, Member>() {
		@Override
		public Member apply(String t) {
			return new Member(t);
		}
	};
	
	Member member1 = function.apply("angel");
	//���ٽ�
	function = t->new Member(t);
	member1 =  function.apply("angel2");
	System.out.println(member1.getId());
	//���ٽĿ��� ������ ����
	function = Member::new;
	
	BiFunction<String,String,Member> function2 = new BiFunction<String,String,Member>() {
		@Override
		public Member apply(String t, String u) {
			return new Member(t,u);
		}
	};
	
	member1 = function2.apply("ȫ�浿","angel");
	System.out.println(member1.getId());
	//���ٽ� ������ ����
	function2 =Member::new;
	Member member2 = function2.apply("ȫ�浿","angel3");
	System.out.println(member2.getId());
	
 }
}

class Member{
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() ����");
	}

	public Member(String id) {
		System.out.println("Member(String id) ����");
		this.id = id;
	}

	public Member(String name, String id) {
		System.out.println("Member(String name, String id) ����");
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}
}