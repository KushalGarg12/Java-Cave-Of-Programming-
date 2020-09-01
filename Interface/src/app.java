
public class app {

	public static void main(String[] args) {
		Machine mach1=new Machine();
		mach1.start();
		person person1=new person("kushal");
		person1.greet();
		
		Info info1 = new Machine();
		
		info1.showinfo();
		Info info2 =  person1;
		info2.showinfo();
		
		outputinfo(mach1);
		outputinfo(person1);
	}
	private static  void outputinfo(Info info){
		info.showinfo();
	}

}
