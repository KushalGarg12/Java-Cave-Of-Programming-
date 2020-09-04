
public class Plant {
	public String name;
	public final static int id=8;
	
	
	private String type;
	
	protected String size;
	
	public Plant(){
		name="kushal";
		//type will work only within this class
		type="plant";
		//size can be accessed within same package and within subclasses
		size="large";
	}
}
