package verify;

public class Ex8 {
public static void main(String[] args) {
  //처음부터 부모객체를 만들어서 자식참조변수에 대입 불가.
	//B b= new A();
  
  //메소드 선언: void method(B b){}//매개변수의 다형성
  //메소드 호출: method(new D());//매개변수의 다형성
  
  new B();//1
  //(B)new A();//2
  new D();//3
  new E();//4

}
}

