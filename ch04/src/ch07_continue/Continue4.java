package ch07_continue;

public class Continue4 {
	public static void main(String[] args) {
		//���� for������ continue;
	Label: for(int i=0;i<=9;i++) {
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j);
				if(j>2) continue Label;// continue�� ���δ� ���� ����� ���� for�������� �̵�.
				System.out.print("���� ��µǳ�\t");
			}
			System.out.println();//���� �Ʒ��� ������� ��� �ȵ�.
		}
	}

}
