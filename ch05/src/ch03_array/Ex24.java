package ch03_array;

public class Ex24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //����Ÿ��(String) 1���� �迭 ����
		String[] snake= {"������","�ȷ���","ĥ����","������","������"};
		String[] insect={"�޶ѱ�","����","������"};
		
		//����Ÿ���� �迭�� �� ����� �ʱⰪ�� �⺻���� null�� �Ǿ�����.
	   //�ι迭 ��ġ��	[null][null][null][null][null][null][null][null][null]
		String[] animal = new String[snake.length + insect.length+1];
		
		//��ġ��
		for(int i=0;i<snake.length;i++) { animal[i]=snake[i];}
		for(int i=0;i<insect.length;i++) {animal[snake.length+i]=insect[i];}
		
		//������ü�� �����ϰ��ִ� �迭�� �� index�� �ش��ϴ� ���� ��ü�� �ּҹ����� ����
		//�� ��� ����� index��ȣ�� ����� ����� �ּҰ��� �����.
		System.out.println(snake[0]==animal[0]?"���ϰ�ü ����":"�ٸ� ��ü ����");
		
		System.out.println(snake[0].hashCode());
		System.out.println(animal[0].hashCode());
		
		String str = snake[0];
		System.out.println(str.hashCode());
		
		//���
		for(String s:animal)
			System.out.print(s+" ");
		System.out.println();
		
	}
}
