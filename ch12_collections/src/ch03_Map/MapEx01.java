package ch03_Map;

import java.util.HashMap;
import java.util.Map;


public class MapEx01 {
	public static void main(String[] args) {
	//Map�������̽� ����
	 Map<String, String> fruits =new HashMap<String,String>();
	 //put(key,value);
	 fruits.put("apple", "���");//key="apple", value="���"
	 //get(key)�� ���� �� value
	 String value = fruits.get("apple");
	 System.out.println(value);//value�� "���"���
}
}
