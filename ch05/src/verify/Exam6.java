package verify;

/* 6. �迭�� ���̿� ���� �����Դϴ�. array.length�� ���� array[2].length�� ���� ���Դϱ�?
 * */ 
public class Exam6 {
	public static void main(String[] args) {
		int[][] array ={ {95,86},
			             {83,92,96},
			             {78,83,93,87,88}
			            };
		System.out.println(array.length);//�������迭 �迭��.length=1�����迭�� ����(���� ��)
		System.out.println(array[2].length);//index��ȣ 2������ �迭�� ����(���� ��=��Ҽ�)
	}
}
