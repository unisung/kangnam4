package ch02_work;

import java.text.DecimalFormat;

public class SeperateVolume implements Lendable{
	//�ʵ�
	static final String itemNo="111";// 111-1, 111-2, 111-001, 111-002,... 111-012
	static int seq=0;
	private String requestNo; //������ȣ
	private String title; //����
	private String writer;//����
	private int state; //��������(�뿩/�ݳ�)
	private String name="";//������
	private String date="";//��������
	
 //�ν��Ͻ� �ʱ�ȭ ��
 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");//��ü ���ڸ� ���ڿ� ����ִ� �κ��� "0"���� ä��.
	requestNo = itemNo +"-"+df.format(seq);
 }
	  
public SeperateVolume(String title, String writer) {
	this.title = title;
	this.writer = writer;
}

public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
}

		@Override
		public void checkOut(String name, String date) {//������,��������
		 //������ ���°� ������¸� ����
	     if(state==BORROWED) {
	    	 System.out.println(title+"�� �̹� �������Դϴ�.");
	    	 return;//
	     }
	     //������°� �ƴϸ� ���� ����
	     this.name=name;//�����ڸ�
	     this.date=date;//��������
	     state=BORROWED;//������� ����(���� -> ����)
	     System.out.println(title+"�� "+name+"�� �����߽��ϴ�.");
	     System.out.println("��������: "+date);
		}

		//�ݳ�
		@Override
		public void checkIn() {
	     name="";//������ Ŭ����
	     date="";//�������� Ŭ����
	     state=NORMAL;//������� (���� -> ����)
	     System.out.println(title+"�� �ݳ��߽��ϴ�.");
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public static String getItemno() {
			return itemNo;
		}

		public String getRequestNo() {
			return requestNo;
		}

		public String getTitle() {
			return title;
		}

		public String getWriter() {
			return writer;
		}
		
     //toString()
		@Override
		public String toString() {
			return "SeperateVolume [requestNo=" + requestNo + ", title=" + title + ", writer=" + writer + ", state="
					+ state + ", name=" + name + ", date=" + date + "]";
		}
}