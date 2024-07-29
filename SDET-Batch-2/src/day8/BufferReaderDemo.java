package day8;
import java.io.*;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// Java program to read a file using BufferReader method
		FileReader fr = new FileReader("demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();

	}

}
