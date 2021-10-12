package ch02_work;

import java.text.DecimalFormat;
import java.util.Arrays;

//클래스

public class Stock {
	//필드
 static final String itemNo="111";// 111-1, 111-2, 111-001, 111-002,... 111-012
 static int seq=0;
 private String item;
 private String name;
 private int qty;

 //인스턴스 초기화 블럭
 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");//전체 세자리 숫자외 비어있는 부분을 "0"으로 채움.
	//df.format(seq);
	item = itemNo +"-"+df.format(seq);
 }
 //생성자
public Stock(String item, String name, int qty) {
	this.item = item;
	this.name = name;
	this.qty = qty;
}
public Stock(String name, int qty) {
	this.name = name;
	this.qty = qty;
}
//메소드

public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getItem() {
	return item;
}
public String getName() {
	return name;
}
//Stock 정보 출력 메소드
@Override
public String toString() {
	return "Stock [item=" + item + ", name=" + name + ", qty=" + qty + "]";
}


}

