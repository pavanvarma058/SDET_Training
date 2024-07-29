package day8;
import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// Java program to write a file using PrintWriter method
		FileWriter fw = new FileWriter("cricket.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("Yeswanth");
		pw.flush();
		pw.close();
	}

}
