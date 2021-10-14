package ch02_Objects_hash;

import java.util.Objects;

public class HashExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿");
		Student s2 = new Student(1,"ȫ�浿");
		System.out.println(s1.hashCode());
		//�Ű������� hashCode()ȣ��
		System.out.println(Objects.hashCode(s2));//o != null ? o.hashCode() : 0;
	}

	static class Student{
		int sno;
		String name;
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			//hash() ����ü�� �ؽð� 
			return Objects.hash(sno,name);//sno�� �ؽ��ڵ�, name�� �ؽ��ڵ�
			//return this.sno+this.name.hashCode();
		}
		
		
		
	}
	
}
