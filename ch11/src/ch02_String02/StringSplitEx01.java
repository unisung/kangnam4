package ch02_String02;

public class StringSplitEx01 {
	public static void main(String[] args) {
	  String str="ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
	  //split(������)
	  String[] names=str.split("&|,|-");

	  for(String name:names)
		  System.out.print(name+" ");
	}
}
