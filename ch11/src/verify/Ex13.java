package verify;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {
	public static void main(String[] args) {
	System.out.println("13.SimpleDateFormatŬ������ �̿��ؼ� ������ ��¥�� ���");
	 Date now = new Date();
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
	 System.out.println(sdf.format(now));

	}
}


