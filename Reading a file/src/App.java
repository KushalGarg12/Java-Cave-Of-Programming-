import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;






public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String filename="C:/Users/Kushal Garg/Desktop/MAIN SCHEDULE.txt";
		File textfile=new File(filename);
		Scanner in=new Scanner(textfile);
		
		int value= in.nextInt();
		System.out.println(value);//after this their is a extra line 
		
		in.nextLine();//This is just to remove the white(empty) line after integer
		
		while(in.hasNextLine()){
			String line=in.nextLine();
			System.out.println(line);
		}
		
		in.close();
		
	}

}
