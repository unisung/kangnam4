package ch01_generics;

public class GenericMethodEx {
	// T�� Ÿ�� �Ű� ������ ���׸� �޼ҵ�
	public <T> GStack<T> reverse(GStack<T> a){//0.0, 1.0, 2.0, 3.0, 4.0 
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp;
			tmp = a.pop();//���� ���ÿ��� ����ϳ��� ���� 4.0, 3.0, 2.0, 1.0, 0.0
			if(tmp==null)break;//������ �����.
			else s.push(tmp);//�� ���ÿ� ��� ����// 4.0, 3.0, 2.0, 1.0, 0.0
		}
		return s;
	}
}
