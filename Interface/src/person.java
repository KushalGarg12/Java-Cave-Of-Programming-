
public class person implements Info{
	public void greet(){
		System.out.println("Hello there!");
	}
	
	private String name;

	public person(String name) {
		
		this.name = name;
		System.out.println(name);
	}

	@Override
	public void showinfo() {
		System.out.println("person name :"+ name);
		
	}
	
}
