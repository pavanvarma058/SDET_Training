package day8;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// Java program to read a file by using FileReader method
		FileReader fr = new FileReader("cricket.txt");
		int i = fr.read();
		while(i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
		
		// Another approach
		File f = new File("cricket.txt");
		FileReader fr1 = new FileReader(f);
		char[] ch = new char[(int) f.length()]; // small amount of data
		fr1.read(ch);
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
	}

}
