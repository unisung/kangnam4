package ch99;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		 ++accumlateRotaion;
		 if(accumlateRotaion<maxRotation) {
			 System.out.println(location+" 한국Tire수명: "+(maxRotation-accumlateRotaion)+"회");
			 return true;
		 }else {
			 System.out.print("*** "+location+" 한국Tire 펑크***");
			 return false;
		 }
	}
	
	

}
