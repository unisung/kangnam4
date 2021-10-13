package ch02_work;

import java.util.Calendar;
import java.util.Scanner;

public class LenderApplication {
	//Ÿ��[] ����
	//Ŭ����[] ����
	private static SeperateVolume[] svArr = new SeperateVolume[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args){
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.������� |2.������� |3.�뿩 |4.�ݳ�|5.����");
		 System.out.println("--------------------------------------");
		 System.out.println("����>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: registerBook(); break;
		 case 2: bookList();break;
		 case 3: checkOut();  break;
		 case 4: checkIn(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("���α׷� ����");
		
	}
	
	//������� - Ctrl + F
	private static void registerBook() {
		System.out.println("------");
		System.out.println("�������");
		System.out.println("------");
		
		System.out.print("����:");
		String name = scanner.next();
		System.out.print("����:");
		String writer = scanner.next();
		
		SeperateVolume sv = new SeperateVolume(name, writer);
		
		svArr[idx++] = sv;
		
		System.out.println("���:��� �Ǿ����ϴ�.");
	}
	//��������Ʈ
	private static void bookList() {
		System.out.println("------");
		System.out.println("���� ���");
		System.out.println("------");
		
		//��ü ����Ÿ�� �迭�� ���������� �����鼭 ���������� null�� �ƴҶ��� ���.
		 for(int i=0;i<svArr.length;i++) { //�����߻�
			 SeperateVolume sv =svArr[i];
			 if(sv!=null) {
				 System.out.println(sv.toString()); //null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
			 }
		  }
	}
	
	//�뿩
	private static void checkOut() {
		System.out.println("------");
		System.out.println("�뿩");
		System.out.println("------");
		System.out.print("������ȣ>");//�뿩�� ������ȣ
		String requestNo = scanner.next();
		System.out.print("ȸ����");//������
		String name=scanner.next();
		//�뿩���� �ڵ����� "2021/10/13"
		Calendar cal = Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int date=cal.get(Calendar.DATE);
		//������ȣ�� �뿩 ���� ã��
		SeperateVolume sv = findVolume(requestNo);
		if (sv != null) {
			//����ó�� �޼ҵ� ����
			sv.checkOut(name, year+"/"+month+"/"+date);
		}else {
			System.out.println("���:������ȣ�� Ȯ�����ּ���.");
		}
	}
	
     //�ݳ�	
	private static void checkIn() {
		System.out.println("------");
		System.out.println("�ݳ�");
		System.out.println("------");
		System.out.print("������ȣ");
		String requestNo = scanner.next();
		
		SeperateVolume sv = findVolume(requestNo);
		if (sv != null) {
			sv.checkIn();
		} else {
			System.out.println("���:���� ��ȣ�� Ȯ�����ּ���.");
		}
	}
     
	//������ȣ�� ���� ã��
	//����Ÿ�� �迭�� �� ��
	private static SeperateVolume findVolume(String requestNo) {
		SeperateVolume sv=null;//���ú���
		for(int i=0;i<svArr.length;i++) {
			  sv =svArr[i];
			if(sv!=null) {  
			  if(sv.getRequestNo().equals(requestNo))
				break;//ano�� �ش��ϴ� ��ü ����
			}
		}
		return sv;	//�迭 ��ü�� ã�Ƶ� ������ null����
	}
}