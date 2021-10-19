package ch03_Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
public static void main(String[] args) {
	TreeMap<Integer,String> scores = new TreeMap<>();
	scores.put(87, "ȫ�浿");
	scores.put(98, "������");
	scores.put(75, "�Ӳ���");
	scores.put(95, "�̼���");
	scores.put(80, "��浿");
	
	//�� entry���� ���� Map.Entry<Ű,��>
	Map.Entry<Integer,String> entry=null;
	
	entry=scores.firstEntry();
	System.out.println("���峷�� ����: "+entry.getKey()+"-"+entry.getValue());
	
	entry=scores.lastEntry();
	System.out.println("������� ����: "+entry.getKey()+"-"+entry.getValue());
	
	entry=scores.higherEntry(95);
	System.out.println("95�� ���� ����:"+entry.getKey()+"-"+entry.getValue());
	
	entry=scores.ceilingEntry(85);
	System.out.println("85�� �̰ų� �ٷ����� ����:"+entry.getKey()+"-"+entry.getValue());
	
	entry=scores.lowerEntry(95);
	System.out.println("95�� �Ʒ��� ����:"+entry.getKey()+"-"+entry.getValue());
	
	entry=scores.floorEntry(85);
	System.out.println("85�� �̰ų� �ٷξƷ� ����:"+entry.getKey()+"-"+entry.getValue());
	
}
}
