package day8;
import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		// Creating a new file
//		File f = new File("cricket.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());
		// making a new directory
		File f = new File("cricket123");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		

	}

}
