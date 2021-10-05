package ch06_methods;

public class Score1 {
	//필드
  int kor;
  int eng;
  int math;
  
  //4유형(매개변수X,리턴타입X)
  void display() {
	  int sum = kor + eng + math;
	  System.out.println("합계:"+sum);
	  System.out.println("평균:"+sum/3);
  }
  //4유형(매개변수X,리턴타입X)
  void print() {
	  System.out.println(kor+"\t"+eng+"\t"+math);
  }
  //3유형(매개변수O, 리턴타입 X)
  void print(int kor,int eng, int math) {
	  System.out.println(kor+"\t"+eng+"\t"+math);
  }
  //1유형(매개변수O, 리턴타입O)
  int res(int kor,int eng, int math) {
	  return kor+ eng+math;
  }
  //2유형(매개변수X,리턴타입O)
  int res() {
	  return kor+eng+math;
  }
  
}
