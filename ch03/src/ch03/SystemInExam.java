package ch03;



public class SystemInExam {
	//ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ����. - ���� ó��
	public static void main(String[] args) throws Exception{//����ó�� ���� throws Exception �߰�
		// TODO Auto-generated method stub
		//���� p.126~128
     //ǥ�� �Է½�Ʈ������ �� �Է� �ޱ�
		System.out.print("�Է�:");
		int a = System.in.read(); //'A' -> ascii 65�� �ν�
		//int a = (int)('A');
		System.out.println("���: "+a);// keyboard�� Ű�� �Է� �� EnterŰ�� ����(EnterŰ = '\r''\n') 
		System.in.read();// \r
		System.in.read();// \n
		
		// System.in.read()-48 or '0'; == ���� 
		System.out.print("�Է� : "); 
		int num = System.in.read() - 48; // ascii - 48  48-48 =0
		// int num=System.in.read()-'0'; 
		System.out.println("��� : " + num); 
		System.in.read(); // \r
		System.in.read(); // \n
		
		// (char)System.in.read(); == ���� 
		System.out.print("�Է� : "); 
		char char_ = (char) System.in.read();//'A' - > 65(int) -> char 'A' 
		// int num=System.in.read()-'0'; 
		System.out.println("��� : " + char_);
		
	}
}
