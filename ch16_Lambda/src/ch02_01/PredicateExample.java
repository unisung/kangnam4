package ch02_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿","����",90),
			new Student("������","����",90),
			new Student("�Ӳ���","����",95),
			new Student("�̼���","����",92)
			);
	//���� �޼ҵ�
	public static double avg(Predicate<Student> predicate) {
		int count =0,sum=0;
		for(Student student:list) {
			if(predicate.test(student)) {
			 count++;
			 sum+=student.getScore();
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		//�������
	  double avgMale = avg(new Predicate<Student>() {
		@Override
		public boolean test(Student t) {
			return "����".equals(t.getGender());
		}
	 });
	  System.out.println("�������: "+avgMale);
	  //���ٽ�
	  avgMale = avg(t->"����".equals(t.getGender()));
	  System.out.println("�������: "+avgMale);

	  //�������
	  double avgFemale = avg(t->t.getGender().equals("����"));
	  System.out.println("�������:"+avgFemale);
	  
	}
}
