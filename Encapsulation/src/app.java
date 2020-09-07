
class Plant{
	public static final int ID=7;
	private String name;
	public String  getdata(){
		String data="some stuff"+ calculategrowthforecast();
		return data;
	}
	
	private int calculategrowthforecast(){
	return 9;	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class app {

	public static void main(String[] args) {
		
	}

}
