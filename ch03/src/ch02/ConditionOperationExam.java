package ch02;

public class ConditionOperationExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int score =95;
      //char ���� ����
        char grade;
        //���ǹ� if �� else ����
       if(score > 90) {// if��
    	   grade ='A';
       }else {//else��
    	   grade ='B';
       }
       
    System.out.println("���:"+grade);//String + char => String + String => "���:" +'A' => "���:"+"A"=>"���:A"
	
    //
    score = 80;  
    grade = score>90 ? 'A' : 'B';
    System.out.println("���:"+grade);//String + char => String + String => "���:" +'A' => "���:"+"A"=>"���:A"
    
    
	}
}
