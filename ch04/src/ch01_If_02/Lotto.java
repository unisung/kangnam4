package ch01_If_02;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 1~45 6���� �ڿ��� ������ �����ϴ� ���α׷�
		//�ݺ���, Set�ڷᱸ��- �ߺ��� �� ���� ���� ����.- �����ϰ� �ϳ��� ���� ���� 1,1 => 1
		//while(true) ���ѹݺ�
		//�ߺ��������� ������ �����ϴ� ����� set�� �� ����
		Set<Integer> lottos = new HashSet<Integer>();
		
		while(lottos.size()<6) {
			 int num=(int)(Math.random()*45)+1;
			 System.out.println(num);
			 lottos.add(num);//set�� �� ����
		}
		
		System.out.println(lottos);
	}
}
