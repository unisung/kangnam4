package exam02;

public class Chap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*1. �ڹ� ������ ���� ���� �� Ʋ�� ����? */
	System.out.println("1.������ �ϳ��� ���� ������ �� �ִ�.  X int x = 10,20;  ");
	System.out.println("2.������ ���� �ÿ� ���� Ÿ���� ���� ������ �� �ִ�.-> Ÿ�� ������;");
	System.out.println("3.������ ������ ����� �߰�ȣ{}�ȿ����� ��䰡��-scope");
	System.out.println("X4.������ �ʱⰪ�� ������� ���� ���ʼ� ���� ���ִ�.->�ݵ�� �ʱ�ȭ�ؾ� ���� ���ִ�.");
	/*2. �����̸����� ��� ������ �� ��� ���� */	
   	System.out.println("1. modelName, X2.class(�����),  "
   			    + "X3.6hour(���ڷν��ۺҰ�), 4$value, 5._age, 6. int(���߾�) "); 
	
   /*3. �ڹ��� �⺻Ÿ�� 8���� */
   System.out.println("����Ÿ��:byte, char/short, int(4byte), long(8byte)" );// 3 -int
   System.out.println("�Ǽ�Ÿ��:                float(4byte), double(8byte)" );// 12.34 -double
   System.out.println("��Ÿ��:boolean");// 12.34 -double
   
   /*4. Ÿ��, �����̸�(�ĺ���), ���ͷ�*/
   int age; // Ÿ�� int  ������ age
   age = 10; // ������ age ������ 10
   double price = 3.14; //Ÿ�� double ������ price  ���ͷ� 3.14
   
   /*5.�ڵ� Ÿ�� ��ȯ, ������ ����*/
   //byte byteValue = 10;
   //char charValue = 'A';
   //int intValue = byteValue;
   //    intValue = charValue;
   //X3.short shortValue = charValue ;//�����߻�
   //double doubleValue = byteValue;
   
   /*6.���� Ÿ�� ��ȯ(casting) ���� */
   int intValue = 10;
   char charValue = 'A';
   double doubleValue = 5.7;
   String strValue = "A";
   
   double var =(double)intValue;// (double)�� ��� ��. 
   byte var1 = (byte)intValue;//���� �߸��� ����.
   int var2 = (int)doubleValue;
   //X.char var3 = (char)strValue;// char�� �⺻(primitive)Ÿ�� - String�� ����Ÿ��
   
   /*7. ������ �߸� �ʱ�ȭ �Ѱ���?*/
   int var11 = 10;//int
   long var22 = 10000000000L;//long
   //X char var3 = '';//���� ����ǥ �ΰ� �� �پ�����.
   double var4 = 10;//int ->double
   float var5 = 10;//int -> float
   
  /*8. ����Ŀ��� Ÿ�Ժ�ȯ ����.  ������ ����*/ 
  byte byteValue = 10;
  float floatValue = 2.5F;
  double doubleValue2 = 2.5;
  
  //java�� Ư���� byteŸ���� ������ ����� intŸ������ ��ȯ�Ͽ� ���꿡 ������.
  // byte, short, char ->> intŸ������ ��ȯ�Ͽ� ���꿡 �����ϵ��� ����Ǿ���.
  // 58������ ��ܺκ� Ȯ��.
  //byte result1 = byteValue + byteValue;//byte + byte => int + int => int
  int result2 = 5 + byteValue;// int + byte => int
  float result3 = 5 + floatValue;// int + float => float
  double result4 = 5 + doubleValue;//int + double => double
   
	}
}
