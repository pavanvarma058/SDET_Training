package day8;
import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//  creating a demo.txt file in the directory using createnewfile method
		File f = new File("demo.txt");
		f.createNewFile();
		File f6 = new File("file1.txt");
		f6.createNewFile();
		File f7 = new File("file2.txt");
		f7.createNewFile();
		File f8 = new File("file3.txt");
		f8.createNewFile();
		File f10 = new File("input.txt");
		f10.createNewFile();
		File f9 = new File("ouput.txt");
		f9.createNewFile();
		File f11 = new File("delete.txt");
		f11.createNewFile();
		
		// create a directory named with Yeswanth123 in current working directory and create a file named with abc.txt in that directory
		File f1 = new File("Yeswanth123");
		f1.mkdir();
		File f2 = new File("Yeswanth123", "abc123.txt");
		f2.createNewFile();

	
		// code to create a file named with demo.txt present in c:\\Yeswanth folder.
		File f4 = new File("D:\\Yeswanth", "demo.txt");
		f4.createNewFile();
	}

}
