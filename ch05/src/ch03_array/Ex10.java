package ch03_array;

public class Ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1���� �迭�� ����
		int[] intArr1 = {1,2,3,4,5};//index��ȣ:0,1,2,3,4 -- 5�� ������ ���
		System.out.println(intArr1.length);
		
		//for(int i=0;i<6;i++)
		//	System.out.println(intArr1[i]);
		
		//intArr1�迭�� 6�� �߰��ϰ�;��.<-�Ұ����մϴ�.
		//�迭�� �ѹ� �����ϸ� ���� �����Ұ�.
		//���: ���ο� �迭�� ���� ������ �� ��ҵ��� ���� ���ο� �迭�� �����ϸ��.
		//�߰��� 6�� ����
		int[] intArr2=new int[6];//[0][0][0][0][0][0]-�ش�Ÿ���� �⺻������ �ʱ�ȭ
		
		//���� intArr1�迭�� ������ ������ �Ŀ�
		for(int i=0; i<intArr1.length ;i++){// i<intArr2.length, i<intArr1.length
		     intArr2[i]=intArr1[i];//[1][2][3][4][5][0]
	    }
		//intArr2�� �������� �ش簪�� ����
		//intArr2.length<=6;
		//intArr2.length -1 = 5;
		//intArr2.length�� ���� ������ �ε�����ȣ�� ? 5(0���� ����) = intArr2.length-1 
		intArr2[intArr2.length-1]=6;//[1][2][3][4][5][6]
		
		for(int s:intArr2)
			System.out.print(s+" ");
		System.out.println();
		
	}
}
