
public class Machine implements Info {
	
	private int id=7;
	
	public void start(){
		System.out.println("Machine started");
	}

	@Override
	public void showinfo() {
		System.out.println("Machine id :"+ id);
		
	}
	
	

}
