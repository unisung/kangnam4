package ch02_String02;

public class StringBuilderEx2 {
	public static void main(String[] args) {
		//
	StringBuffer sb = new StringBuffer();
	
	 //문자열 이어붙익 append()
	 sb.append("Java ");
	 sb.append("Programming study");
	 //
	 System.out.println(sb);//toString()내용출력
	 
	 //삽입 insert(index,문자열)
	 sb.insert(4, "2");
	 System.out.println(sb);//toString()내용출력
	 //setCharAt(index,바꿀문자)
	 sb.setCharAt(4, '6');
	 System.out.println(sb);//toString()내용출력
	 
	 //replace(시작index,끝index,바꿀문자열);  시작index번호<=범위<끝index
	 sb.replace(6, 13, "Book");
	 System.out.println(sb);//toString()내용출력
	 
	 // delete(시작index,끝index); 시작index <=범위 < 끝index
	 sb.delete(4,5);
	 System.out.println(sb);//toString()내용출력
	 
	 int length = sb.length();
	 System.out.println("총 문자수:"+length);
	 
	 //
    String result = sb.toString();//버퍼내용을 추출
    System.out.println(result);
	 
	}

}
