class Machine{
	private String name;
	public Machine(){
		this("kushal");
		System.out.println("constructor running...");
		name="Kushal";
	}
	public Machine (String name){
		System.out.println("second constructor");
		this.name=name;
	}
	
}
public class constructors {

	public static void main(String[] args) {
		//Machine machine1=new Machine();
		new Machine();
		new Machine("Bertie");

	}

}
