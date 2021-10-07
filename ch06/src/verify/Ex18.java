package verify;

public class Ex18 {
public static void main(String[] args) {
	ShopService obj1 = ShopService.getInstance();
	ShopService obj2 = ShopService.getInstance();
	System.out.println(obj1==obj2?"���� ��ü":"�ٸ� ��ü");
}
}
/*�̱��� 
 * 1.�ڽ�Ÿ���� private static�ʵ����
 * 2.default�����ڸ� private�� ����
 * 3.public getInstance() �޼ҵ� ����
 * */
class ShopService{
	//private static ShopService instance=new ShopService();
	private static ShopService instance;
	private ShopService() {}
	public static ShopService getInstance() {
		if(instance==null) instance=new ShopService();
		return instance;
	}
}