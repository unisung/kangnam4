package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//1.String��ü�� ��� List����� 
		List<String> list=new ArrayList<>();
		//2."ȫ�浿", "������", "�Ӳ���" �� ���� ��
		list.add("ȫ�浿");list.add("������");list.add("�Ӳ���");
		//3.����� ������ �����ϵ��� �ۼ�
		System.out.println(list.size());
		//4. "�̼���"�� ����ִ��� Ȯ��
		System.out.println(list.contains("�̼���")?"�������":"����");
		//5. ��� ��ü�� ���
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		for(String s:list)
			System.out.println(s);
		//6. index��ȣ 2���� �ش��ϴ� ��ü�� "������"���� �����ϼ���.
		list.set(2, "������");
		//7. index��ȣ 2���� �ش��ϴ� ��ü�� ����ϼ���
		System.out.println(list.get(2));
		//8. ����Ʈ���� ��� ��ü�� ������  
        list.clear();
		//9. ����Ʈ�� ����ִ��� Ȯ�� �޼����� ���
		System.out.println(list.isEmpty()?"��":"�Ⱥ�");

	}
}
