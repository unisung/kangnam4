package ch03_array;

public class Ex22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //����Ÿ��(String) 1���� �迭 ����
		String[] snake= {"������","�ȷ���","ĥ����","������","������"};
		String[] insect={"�޶ѱ�","����","������"};
	   //�ι迭 ��ġ��	
		String[] animal = new String[snake.length + insect.length];
		
		//��ġ��
		for(int i=0;i<snake.length;i++) { animal[i]=snake[i];}
		for(int i=0;i<insect.length;i++) {animal[snake.length+i]=insect[i];}
		
		//���
		for(String s:animal)
			System.out.print(s+" ");
		System.out.println();
		
	}
}
