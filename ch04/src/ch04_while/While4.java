package ch04_while;

import java.io.IOException;

public class While4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2~9������ ���ڸ� �Է��ϼ���.");
		//Ű����� ���� 0�� ������ �ԷµǴ� ����? 48 <-ASCII�ڵ� ��
		try {
			int num = System.in.read()-'0';//ǥ���Է� ��Ʈ�� '0'Ű�� �������:48-48,'1'=>49-48=1
			System.out.println("������ "+num +"��");
			if(num>=2 && num <=9) {
				int i=1;
				while(i<=9){// while��{}�� ���������� ����
					System.out.println(num+"*"+i+"="+(i*num));//���
					i++;//���� ��ɹ�
				 }
			}else {
				System.out.println("2~9������ ���ڸ� �Է��ϼ���!!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�����߻�");
		}
	}
}
