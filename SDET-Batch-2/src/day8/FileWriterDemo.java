package day8;
import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// Java program to write in a file using FileWriter method
		FileWriter fw = new FileWriter("cricket.txt", true);
		fw.write(89); // adding a single character
		fw.write("eswanth \nsoftware solutions");
		fw.write("\n");
		char[] ch = {'a', 'b', 'c', 'd'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
