package verify;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("7.���� ���ڿ����� \"�ڹ�\" ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϰ�, \"�ڹ�\"�� Java�� ��ġ�� ���ο� ���ڿ��� ������.");
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index =str.indexOf("�ڹ�");//�ش繮����ġindex������, -1�� ����
		if(index==-1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str=str.replace("�ڹ�", "Java");//"��� ���α׷��� Java ���� ���ߵ� �� �ִ�.";
			System.out.println("--->"+str);
		}
	}
}