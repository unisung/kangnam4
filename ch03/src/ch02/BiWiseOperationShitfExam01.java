package ch02;

public class BiWiseOperationShitfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte c = 20;//0x14
		byte d = -8;//0xf8
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);//c���� 2��Ʈ ���� ����Ʈ
		System.out.println(c>>2);//c���� 2��Ʈ ������ ����Ʈ, ���ʿ� �ֻ��� ��Ʈ 0 ����(���)
		System.out.println(d>>2);//d���� 2��Ʈ ������ ����Ʈ, ���ʿ� �ֻ��� ��Ʈ 1 ����(����)
		
		System.out.printf("%04x\n", d);//shift������ ��  00   f    8
		                               //                 1111 1000 -> (00����)0011 1110 (����)00
		System.out.printf("%04x\n", (int)d);//fffffff8
		System.out.printf("%x\n",(d>>>2));//d�� 2��Ʈ ������ ����Ʈ, ���ʿ� ������ 0�� ���Ե�.
        //   3  f      f     f       f  f     f    e
		// 0011 1111  1111 1111  1111 1111  1111 1110 (>>> �� �� int��)
		// 0011 1111  1111 1111  1111 1111  1111 1110                  00(����)
		// 1111 1111  1111 1111  1111 1111  1111 1000(int)�� ��ȯ�� ������
	}
}
