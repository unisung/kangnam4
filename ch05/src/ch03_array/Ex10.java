package ch03_array;

public class Ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1차원 배열의 복사
		int[] intArr1 = {1,2,3,4,5};//index번호:0,1,2,3,4 -- 5는 범위를 벗어남
		System.out.println(intArr1.length);
		
		//for(int i=0;i<6;i++)
		//	System.out.println(intArr1[i]);
		
		//intArr1배열에 6을 추가하고싶어요.<-불가능합니다.
		//배열은 한번 생성하면 길이 수정불가.
		//방법: 새로운 배열을 만들어서 기존의 각 요소들의 값은 새로운 배열로 복사하면됨.
		//추가로 6을 저장
		int[] intArr2=new int[6];//[0][0][0][0][0][0]-해당타입의 기본값으로 초기화
		
		//먼저 intArr1배열의 내용을 복사한 후에
		for(int i=0; i<intArr1.length ;i++){// i<intArr2.length, i<intArr1.length
		     intArr2[i]=intArr1[i];//[1][2][3][4][5][0]
	    }
		//intArr2의 마지막에 해당값을 저장
		//intArr2.length<=6;
		//intArr2.length -1 = 5;
		//intArr2.length의 제일 마지막 인덱스번호는 ? 5(0부터 시작) = intArr2.length-1 
		intArr2[intArr2.length-1]=6;//[1][2][3][4][5][6]
		
		for(int s:intArr2)
			System.out.print(s+" ");
		System.out.println();
		
	}
}
