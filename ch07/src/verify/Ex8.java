package verify;

public class Ex8 {
public static void main(String[] args) {
  //ó������ �θ�ü�� ���� �ڽ����������� ���� �Ұ�.
	//B b= new A();
  
  //�޼ҵ� ����: void method(B b){}//�Ű������� ������
  //�޼ҵ� ȣ��: method(new D());//�Ű������� ������
  
  new B();//1
  //(B)new A();//2
  new D();//3
  new E();//4

}
}

