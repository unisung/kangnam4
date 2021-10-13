package verify;

public interface Soundable {
 String sound();
}
class Cat implements Soundable{
	@Override
	public String sound() {
		return "具克";
	}
}
class Dog implements Soundable{
	@Override
	public String sound() {
		return "港港";
	}
}