package ch99;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		 ++accumlateRotaion;
		 if(accumlateRotaion<maxRotation) {
			 System.out.println(location+" �ѱ�Tire����: "+(maxRotation-accumlateRotaion)+"ȸ");
			 return true;
		 }else {
			 System.out.print("*** "+location+" �ѱ�Tire ��ũ***");
			 return false;
		 }
	}
	
	

}
