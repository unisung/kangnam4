package ch01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//문자단위(2byte)로 파일 저장하는 스트림객체 선언
		FileWriter fout=null;
		int c;//
		try {
			fout = new FileWriter("c:\\temp\\test2.txt");
			while(true) {
				String line = scanner.nextLine();//한 줄 단위로 입력받기
				if(line.length()==0) break;//문장입력없이 Enter키 치면 빠져나가기
				fout.write(line,0,line.length());//write(문자열,시작index,문자열길이);
				fout.write("\r\n",0,2);//문장뒤에 캐리지 리턴추가
			}
			//자원해제
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//자원해제
		scanner.close();
	}
}
