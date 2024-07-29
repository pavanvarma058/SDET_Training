package day8;
import java.io.*;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		// java program to perform File merge(combine) operation.
		PrintWriter pw=new PrintWriter("file3.txt"); 
		BufferedReader br=new BufferedReader(new FileReader("file1.txt")); 
		String line=br.readLine(); 
		while(line!=null) { 
		   pw.println(line); 
		   line=br.readLine(); 
		} 
		br = new BufferedReader(new FileReader("file2.txt"));    //reuse 
		line=br.readLine(); 
		while(line!=null) { 
	       pw.println(line); 
	       line=br.readLine(); 
		} 
		
		pw.flush();
		br.close();
		pw.close();

	}

}
