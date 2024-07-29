package day8;
import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// Java program to write a file using BufferWriter method
		FileWriter fw = new FileWriter("demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		bw.write(ch);
		bw.newLine();
		bw.write("Yeswanth");
		bw.newLine();
		bw.write("Software Solutions");
		bw.flush();
		bw.close();
	}

}
