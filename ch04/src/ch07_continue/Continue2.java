package ch07_continue;

public class Continue2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¦���� ���
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {//Ȧ���� ��� �����ʱ� - Ȧ���� ���
				continue;// for���̸� i++������ �ٷ� �̵�, �Ʒ� print(i)���� �������� ����.
			}
			System.out.println(i);
		}
	}
}
