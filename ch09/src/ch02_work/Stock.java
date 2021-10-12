package ch02_work;

import java.text.DecimalFormat;
import java.util.Arrays;

//Ŭ����

public class Stock {
	//�ʵ�
 static final String itemNo="111";// 111-1, 111-2, 111-001, 111-002,... 111-012
 static int seq=0;
 private String item;
 private String name;
 private int qty;

 //�ν��Ͻ� �ʱ�ȭ ��
 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");//��ü ���ڸ� ���ڿ� ����ִ� �κ��� "0"���� ä��.
	//df.format(seq);
	item = itemNo +"-"+df.format(seq);
 }
 //������
public Stock(String item, String name, int qty) {
	this.item = item;
	this.name = name;
	this.qty = qty;
}
public Stock(String name, int qty) {
	this.name = name;
	this.qty = qty;
}
//�޼ҵ�

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
//Stock ���� ��� �޼ҵ�
@Override
public String toString() {
	return "Stock [item=" + item + ", name=" + name + ", qty=" + qty + "]";
}


}

