package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx03 {
public static void main(String[] args) {
	Map<String,Double> cities = new HashMap<>();
	 cities.put("����", 32.5);//
	 cities.put("����¡",35.8);
	 cities.put("ȫ��",39.5);
	 cities.put("����",38.7);
	 
	 //Ű���翩��Ȯ��
	 System.out.println(cities.containsKey("����¡"));
	 //�� ���翩��Ȯ��
	 System.out.println(cities.containsValue(38.7));//38.7->Integer(38.7) AutoBoxing
	 
	 //����� ���� size()
	 System.out.println(cities.size());
	 
	 //Ư�� Ű�� �ش��ϴ� ��ü ���� -���� �� ���� remove(Ű);
	 System.out.println(cities.remove("ȫ��"));
	 
	 //��ü ����
	 cities.clear();
	 
	 //����ִ��� Ȯ��
	 System.out.println(cities.isEmpty());
	 

}
}
