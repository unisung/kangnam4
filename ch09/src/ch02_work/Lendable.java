package ch02_work;


public interface Lendable {
	//��� -flag:����ǥ�� 
	int BORROWED = 1;//����
	int NORMAL = 0;//�̴���
    //�뿩�޼ҵ�
	void checkOut(String name, String date);
    //�ݳ�
	void checkIn();

}
