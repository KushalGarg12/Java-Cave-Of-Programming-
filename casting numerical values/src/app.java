
public class app {

	public static void main(String[] args) {
		
		byte bytevalue=20;
		short shortvalue=55;
		int intvalue=888;
		long longvalue=23355;
		float floatvalue=8834.3f;
		double doublevalue=32.4;
		
		System.out.println(Byte.MAX_VALUE);
		intvalue=(int)longvalue;
		System.out.println(intvalue);
		
		doublevalue=intvalue;
		System.out.println(doublevalue);
		
		intvalue=(int)floatvalue;
		System.out.println(intvalue);
		
		bytevalue=(byte)128;
		System.out.println(bytevalue);
	}

}
