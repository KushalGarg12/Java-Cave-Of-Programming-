class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("jumping:"+height);
	}
	public void move(String direction,double dist){
		System.out.println("Moving "+direction +" distance "+dist);
	}
}
public class app {

	public static void main(String[] args) {
		Robot sam =new Robot();
		sam.speak("Hi I'm kushal.");
		sam.jump(30);
		sam.move("west", 20.2);

	}

}
