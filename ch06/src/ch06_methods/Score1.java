package ch06_methods;

public class Score1 {
	//�ʵ�
  int kor;
  int eng;
  int math;
  
  //4����(�Ű�����X,����Ÿ��X)
  void display() {
	  int sum = kor + eng + math;
	  System.out.println("�հ�:"+sum);
	  System.out.println("���:"+sum/3);
  }
  //4����(�Ű�����X,����Ÿ��X)
  void print() {
	  System.out.println(kor+"\t"+eng+"\t"+math);
  }
  //3����(�Ű�����O, ����Ÿ�� X)
  void print(int kor,int eng, int math) {
	  System.out.println(kor+"\t"+eng+"\t"+math);
  }
  //1����(�Ű�����O, ����Ÿ��O)
  int res(int kor,int eng, int math) {
	  return kor+ eng+math;
  }
  //2����(�Ű�����X,����Ÿ��O)
  int res() {
	  return kor+eng+math;
  }
  
}
