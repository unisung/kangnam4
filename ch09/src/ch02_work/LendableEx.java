package ch02_work;


public class LendableEx {
	public static void main(String[] args) {
		//������ü ����
		SeperateVolume sv = new SeperateVolume("1111","����","�޹�");
		SeperateVolume sv2 = new SeperateVolume("2222","���� JSP","ȫ�浿");
		
		//�뿩
		printState(sv);
		sv.checkOut("����","2021/03/25");
        printState(sv);
        
        sv.checkOut("�浿","2021/03/26");
        
        //�ݳ�
        sv.checkIn();
        
        printState(sv2);
		sv.checkOut("����","2021/08/15");
        printState(sv2);
        sv.checkIn();
	}
	
	static void printState(SeperateVolume sv) {
		if(sv.state ==sv.BORROWED) {
			System.out.println("==== �������� å ====");
			System.out.println("������: "+sv.name);
			System.out.println("������: "+sv.date);
		}else {
			System.out.print("==== ���� ���� å====");
		}
	}

}
