package day8;
import java.io.*;

public class DisplayNames {

	public static void main(String[] args) {
		// Java program to display the names of all files and directories present in D:\\Yeswanth.
		int count = 0;
//		File f = new File("D:\\Yeswanth");
//		String[] s = f.list();
//		
//		for(String s1: s) {
//			count++;
//			System.out.println(s1);
//		}
//		System.out.println("Total Number of Count: " + count);
		
		
		// Java program to display only file names
//		File f = new File("D:\\Yeswanth");
//		String[] s = f.list();
//		
//		for(String s1: s) {
//			File f1 = new File(f, s1);
//			if(f1.isFile()) {
//				count++;
//				System.out.println(s1);
//			}
//		}
//		System.out.println("Total Number of Count: " + count);
		

		// Java program to display only directory names
		File f = new File("D:\\Yeswanth");
		String[] s = f.list();
		
		for(String s1: s) {
			File f1 = new File(f, s1);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("Total Number of Count: " + count);

	}

}
