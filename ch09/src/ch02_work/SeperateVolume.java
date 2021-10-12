package ch02_work;

import java.text.DecimalFormat;

public class SeperateVolume implements Lendable{
	//필드
	static final String itemNo="111";// 111-1, 111-2, 111-001, 111-002,... 111-012
	static int seq=0;
	private String requestNo; 
	private String title; 
	private String writer;
	private int state; 
	private String name="";
	private String date="";
	
 //인스턴스 초기화 블럭
 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");//전체 세자리 숫자외 비어있는 부분을 "0"으로 채움.
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
		public void checkOut(String name, String date) {
	     if(state==BORROWED) return;//
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//대출상태 변경
	     System.out.println(title+"을 "+name+"가 대출했습니다.");
	     System.out.println("대출일자: "+date);
		}

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"을 반납했습니다.");
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

		public static int getSeq() {
			return seq;
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

		@Override
		public String toString() {
			return "SeperateVolume [requestNo=" + requestNo + ", title=" + title + ", writer=" + writer + ", state="
					+ state + ", name=" + name + ", date=" + date + "]";
		}	
}
