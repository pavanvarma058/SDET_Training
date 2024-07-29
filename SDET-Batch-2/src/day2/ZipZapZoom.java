package day2;
import java.util.*;

public class ZipZapZoom {

	public static void main(String[] args) {
		// Q. Java program to find that display a message for a given number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
        int in = sc.nextInt();
        if(in % 3 == 0 && in % 5 == 0){
            System.out.println("Zoom");
        }else if(in % 3 == 0){
            System.out.println("Zip");
        }else if(in % 5 == 0){
            System.out.println("Zap");
        }else {
            System.out.println("Invalid");
        }


	}

}
