package ch02;

//Ŭ������ ����� ��� - �θ�Ŭ������ �ʵ�, �޼ҵ�
//�ڽ�Ŭ������ extends �θ�Ŭ������{}
public class Truck extends Car{
  //�ʵ�(�Ӽ�,property,�ɹ�����)
   public String model="truck";

  //�޼ҵ�  
@Override
public void run() {
	System.out.println("Ʈ���� �޸��ϴ�.");
}
   
   
}
