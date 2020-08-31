class Thing{
	public String name;
	public static String description;
	
	public void showname(){
		System.out.println(name);
	}
	public static void showinfo(){
		System.out.println("Hello");
	}
}
public class sta_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing thing1=new Thing();
		thing1.name="Bob";
		System.out.println(thing1.name);
		Thing.description="I am a boy";
		System.out.println(Thing.description);
		
		thing1.showname();
		Thing.showinfo()
	}

}
