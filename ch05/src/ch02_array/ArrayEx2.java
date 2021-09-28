package ch02_array;

public class ArrayEx2 {
public static void main(String[] args) {
	//배열선언
	//타입[] 변수명=new 타입[저장할요수갯수];
	int[] scores=new int[10];
	
	//동일타입의 값이 순서대로 연속해서 저장됨.
	//배열의 index시작은 0부터
	scores[0]=10;
	scores[1]=15;
	scores[2]=5;
	scores[3]=7;
	scores[4]=8;
	scores[5]=3;
	scores[6]=9;
	scores[7]=10;
	scores[8]=5;
	scores[9]=4;//배열의 마지막은 저장요소의 갯수 -1 번이 index번호
	
	int sum=0;
	
	for(int i=0;i<10;i++) {
		 sum=sum+scores[i];// 배열에 저장된 요소 접근 - 배열변수명[index번호] 
	}
	
	double avg = sum/(double)10;
	System.out.println("avg:"+avg);

}
}
