package verify;

public class Ex3 {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
 public static void main(String[] args) {
	 printSound(new Cat());//Cat -> Soundable
	 printSound(new Dog());//Dog -> Soundable
	
}
 
}
