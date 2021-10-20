package verify;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex9 {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null;
    int maxScore = 0;
    int totalScore = 0;
    //
    Set<String> keySet = map.keySet();
    Iterator<String> it=keySet.iterator();
    while(it.hasNext()) {
    	String key = it.next();
    	int value = map.get(key);
    	totalScore +=value;
    	
    	if(maxScore < value) { 
    		maxScore =value;
    		name = key;
    	}
    }
    
    System.out.println("�������:"+totalScore / map.size());
    System.out.println("�ְ�����:"+maxScore);
    System.out.println("�ְ������� ���� ���̵� :"+ name);
    
   /*----------------------------------------------------*/
    name = null;
    maxScore = 0;
    totalScore = 0;
    
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    for(Map.Entry<String, Integer> entry:entrySet) {
    	if(entry.getValue()>maxScore) {
    		name= entry.getKey();
    		maxScore = entry.getValue();
    	}
    	totalScore += entry.getValue();
    }
    
    System.out.println("�������:"+totalScore / map.size());
    System.out.println("�ְ�����:"+maxScore);
    System.out.println("�ְ������� ���� ���̵� :"+ name);
    
    
    
    
}
}
