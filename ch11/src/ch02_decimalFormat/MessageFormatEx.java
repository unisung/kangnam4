package ch02_decimalFormat;

import java.text.MessageFormat;

public class MessageFormatEx {
public static void main(String[] args) {
	String id="java";
	String name="�ſ��";
	String tel="010-123-4567";
	
	String text ="ȸ�� ID:{0} \n ȸ���̸�:{1}\n ȸ����ȭ:{2}";
	String result1 = MessageFormat.format(text, id,name,tel);//bindig����
	System.out.println(result1);
	
	
	String sql ="insert into member values({0},{1},{2})";
	Object[] arguments= {"'java'","'�ſ��'","'010-123-4567'"};
	String result2 = MessageFormat.format(sql, arguments );
	System.out.println(result2);

}
}
