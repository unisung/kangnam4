package ch01_Object_finalize;

public class FinalizeEx {
public static void main(String[] args) {
	Counter counter=null;
	for(int i=1;i<=50;i++) {
		counter=new Counter(i);
		//���������� ��ü ��������
		counter=null;
		//gcȣ��
		System.gc();
	}
}
}
