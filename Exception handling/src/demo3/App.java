package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		try {
			openfile();
		} catch (FileNotFoundException e) {
			
			System.out.println("could not open");
		}

	}
	public static void openfile() throws FileNotFoundException{
		File file = new File("text.txt");
		FileReader fr=new FileReader(file);
	}

}
