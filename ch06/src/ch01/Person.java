package ch01;

/* ��� Ŭ����*
 * main()�޼ҵ尡 ���� Ŭ���� - ���̺귯����*/
public class Person {
	//�Ӽ�
	Car car=new Car();//������
	//���
  void calc() {
	  //Calculator��add()�޼ҵ忡 10�� 20�� �����Ͽ� ��ȣ����
	  int result = Calculator.add(10,20);
	  //���޵� ��� ���� ���
	  System.out.println(result);
	}
}
