class Frog{
	private String name;
	int age ;
	public String getname(){
		return name ;
	
	}
	public int getage(){
		return age;
	}
	public void setname(String name){
		this.name=name;
	}
}
public class This {

	public static void main(String[] args) {
		Frog frog1=new Frog();
		//frog1.name="Bertie";
		frog1.age=1;
		frog1.setname("Bertie");
		//frog1.getname();
		System.out.println(frog1.getname());

	}

}
