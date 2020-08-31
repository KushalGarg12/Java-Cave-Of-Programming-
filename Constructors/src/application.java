import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		int number;
		number = 50;
		String text = "Hello";
		System.out.println(number);
		System.out.println(text);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String text1= input.nextLine();
		System.out.println("you entered "+ text1);
	}

}
