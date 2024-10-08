package day8;
import java.io.*;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		// java program to delete duplicate numbers from the file.
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("ouput.txt");
		String target = br1.readLine();
		while(target != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("ouput.txt"));
			String line = br2.readLine();
			while(line != null) {
				if(target.equals(line)) {
					available = true;
					break;
				}
				line = br2.readLine();
			}
			if(available == false) {
				pw.println(target);
				pw.flush();
			}
			target = br1.readLine();
		}
	}

}
