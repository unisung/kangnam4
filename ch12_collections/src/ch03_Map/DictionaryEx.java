package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// "apple"-"���", "pear"-"��", "peach"-"������", 
		// "puppy"-"������", "cow"-"��", "zebra"-"��踻", "chicken"-"��"
		// �ʿ� ���� ��
	    // scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ��� ���
		// map�� Ű�� ������ �ٽ� �Է��ϵ���
		// �������� "end"�� �ԷµǸ� ����;
		Map<String,String> dictionarys=new HashMap<>();
		dictionarys.put("apple","���");
		dictionarys.put("pear","��");
		dictionarys.put("peach","������");
		dictionarys.put("puppy","������");
		dictionarys.put("cow","��");
		dictionarys.put("zebra","��踻");
		dictionarys.put("chicken","��");
		dictionarys.put("cat","�����");
		
	 while(true) {	
		//��ȸ�� �ܾ�
		System.out.println("��ȸ�� ���ܾ �Է��ϼ���>");
		String key = scanner.next();
		if(!key.equals("end")) {
		 if(dictionarys.containsKey(key)){
			System.out.println(dictionarys.get(key));
		 }else {
			 System.out.println("�ش��ϴ´ܾ �����ϴ�.");
		 }
		}else
			break;
	 }//
	 System.out.println("����");
}
}
