package ch02_work;

public class SeperateVolume implements Lendable{
	String requestNo; String title; String writer;
	  int state; String name="", date="";
	  
	  
	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

		@Override
		public void checkOut(String name, String date) {
	     if(state==BORROWED) return;//
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//������� ����
	     System.out.println(title+"�� "+name+"�� �����߽��ϴ�.");
	     System.out.println("��������: "+date);
		}

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"�� �ݳ��߽��ϴ�.");
		}	
}
