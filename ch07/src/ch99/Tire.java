package ch99;

public class Tire {
   public int maxRotation;
   public int accumlateRotaion;//0
   public String location;
   
public Tire(String location, int maxRotation) {
	this.location = location;
	this.maxRotation = maxRotation;
}
   
public boolean roll() {
	 ++accumlateRotaion;
	 if(accumlateRotaion<maxRotation) {
		 System.out.println(location+" Tire����: "+(maxRotation-accumlateRotaion)+"ȸ");
		 return true;
	 }else {
		 System.out.print("*** "+location+" Tire ��ũ***");
		 return false;
	 }
}
   
}
