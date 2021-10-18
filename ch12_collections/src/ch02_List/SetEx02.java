package ch02_List;

public class SetEx02 {
public static void main(String[] args) {
   //Set인터페이스 로 선언된 set생성
   //Member1 String sno, String name으로 구성
   //"1","홍길동"  "2","일지매"  "3","임꺽정", "2","일지매"
   //중복배제하여 저장 후 모든 객체를 출력
	 
}
}

class Member1{
	private String sno; 
	private String name;
	public Member1(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Member1 [sno=" + sno + ", name=" + name + "]";
	}
	
	
}

