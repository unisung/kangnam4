package ch07_continue;

public class Continue3 {
	public static void main(String[] args) {
		//���� for������ continue;
		for(int i=0;i<=9;i++) {
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j);
				if(j>2) continue;// continue�� ���δ� ���� ����� ���� for�������� �̵�.
				System.out.print("���� ��µǳ�\t");
			}
			System.out.println();//���� �Ʒ��� ������
		}
	}

}
