package verify;

import java.text.DecimalFormat;
import java.util.Arrays;

//Ŭ����

public class Account {
	//�ʵ�
 static final String bankNo="111";
 static int seq=0;
 private String ano;
 private String owner;
 private int balance;

 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");
	df.format(seq);
	ano = bankNo +"-"+df.format(seq);
 }
 //������
public Account(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}
public Account(String owner, int balance) {
	this.owner = owner;
	this.balance = balance;
}
//������
public String getAno() {
	return ano;
}
public void setAno(String ano) {
	this.ano = ano;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
//Account ���� ��� �޼ҵ�
@Override
public String toString() {
	return "Account [���¹�ȣ=" + ano 
			+ ", ������=" + owner 
			+ ", �ܰ�=" + balance + "]";
}

}

