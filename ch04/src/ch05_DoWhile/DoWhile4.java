package ch05_DoWhile;

public class DoWhile4 {
public static void main(String[] args) {
	//�ʱⰪ
	int i=1,j=2;
	//��ø do~while������ ������ ���
	do {
		do {
			System.out.print(j+"*"+i+"="+(i*j)+"\t");
			j++;//����
		}while(j <=9); 
		i++;//����
		j=2;///�ʱ�ȭ
		System.out.println();
	}while(i<=9);
}
}
