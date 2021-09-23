package exam02;

public class Chap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*1. 자바 변수에 대한 설명 중 틀린 것은? */
	System.out.println("1.변수는 하나의 값만 저장할 수 있다.  X int x = 10,20;  ");
	System.out.println("2.변수는 선언 시에 사용된 타입의 값만 저장할 수 있다.-> 타입 변수명;");
	System.out.println("3.변수는 변수가 선언된 중괄호{}안에서만 사요가능-scope");
	System.out.println("X4.변수는 초기값이 저장되지 않은 상탱서 읽을 수있다.->반드시 초기화해야 읽을 수있다.");
	/*2. 변수이름으로 사용 가능한 것 모두 선택 */	
   	System.out.println("1. modelName, X2.class(예약어),  "
   			    + "X3.6hour(숫자로시작불가), 4$value, 5._age, 6. int(예야어) "); 
	
   /*3. 자바의 기본타입 8가지 */
   System.out.println("정수타입:byte, char/short, int(4byte), long(8byte)" );// 3 -int
   System.out.println("실수타입:                float(4byte), double(8byte)" );// 12.34 -double
   System.out.println("논리타입:boolean");// 12.34 -double
   
   /*4. 타입, 변수이름(식별자), 리터럴*/
   int age; // 타입 int  변수명 age
   age = 10; // 변수명 age 리터털 10
   double price = 3.14; //타입 double 변수명 price  리터럴 3.14
   
   /*5.자동 타입 변환, 컴파일 오류*/
   //byte byteValue = 10;
   //char charValue = 'A';
   //int intValue = byteValue;
   //    intValue = charValue;
   //X3.short shortValue = charValue ;//오류발생
   //double doubleValue = byteValue;
   
   /*6.강제 타입 변환(casting) 오류 */
   int intValue = 10;
   char charValue = 'A';
   double doubleValue = 5.7;
   String strValue = "A";
   
   double var =(double)intValue;// (double)이 없어도 됨. 
   byte var1 = (byte)intValue;//값이 잘릴수 있음.
   int var2 = (int)doubleValue;
   //X.char var3 = (char)strValue;// char는 기본(primitive)타입 - String은 참조타입
   
   /*7. 변수를 잘못 초기화 한것은?*/
   int var11 = 10;//int
   long var22 = 10000000000L;//long
   //X char var3 = '';//작은 따옴표 두개 가 붙어있음.
   double var4 = 10;//int ->double
   float var5 = 10;//int -> float
   
  /*8. 연산식에서 타입변환 내용.  컴파일 오류*/ 
  byte byteValue = 10;
  float floatValue = 2.5F;
  double doubleValue2 = 2.5;
  
  //java의 특성상 byte타입의 값으로 연산시 int타입으로 변환하여 연산에 참가함.
  // byte, short, char ->> int타입으로 변환하여 연산에 참가하도록 설계되었슴.
  // 58페이지 상단부분 확인.
  //byte result1 = byteValue + byteValue;//byte + byte => int + int => int
  int result2 = 5 + byteValue;// int + byte => int
  float result3 = 5 + floatValue;// int + float => float
  double result4 = 5 + doubleValue;//int + double => double
   
	}
}
