package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
			//this line does'nt execute as it throws exception
			System.out.println("continue..");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + file.toString());
		}

	}

}
