package ch01_If_02;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // ������ �̿��Ͽ�
	  //  61~ 70������ �������� �� ���, 61, 62, 63,64,65,66,67,68,69,70
	  //  61 +0, 61+1, 62+2, 62+3, 61+4, 61+5,61+6,61+7, 61+8, 61+9
		int num = (int)(Math.random()*10) ;// 0<= <10
		System.out.println(61+num);
	}
}
