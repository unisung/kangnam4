package ch02;

public class BitWiseOperExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1 2 3 4 5 6 7 8 9 a b c d e f	
short a = (short)0x55ff;// 5 5 15 15 => 5*16^3 + 5*16^2 + 15*16^1 + 15*16^0 = 20480 + 1280 + 240 + 15=22015;
                  //  5    5     f   f
                  // 0101 0101  1111 1111
short b = (short)0x00ff;// 0 0 15 15 => 255;
                 //    0   0     f     f
                 //  0000 0000  1111  1111
System.out.println(a);// short
System.out.println(b);// short
		
//��Ʈ �� ����
System.out.println("[��Ʈ ���� ���]");
//printf()�� ��� ���� �޼ҵ�, printf("%�������",��);//���� ���� ���·� �������.
System.out.println((short)(a&b));// A and B
//System.out.printf("%0x\n",(short)(a&b));// A and B, %���� ����, 0x�� 16����, \n�� escape���� �����ٷ� �̵�
System.out.printf("%04x\n",(short)(a&b));// A and B, %���� ����, 0x�� 16����, 04x =>0x������ 4�� ��� ����ǥ��
System.out.printf("%04x\n",(short)(a|b));//		
System.out.printf("%04x\n",(short)(a^b));
System.out.printf("%04x\n",(short)(~a));// ~0101 0101  1111 1111=> 1010 1010 0000 0000 => 10 10 0 0 = a a 0 0
	}
}
