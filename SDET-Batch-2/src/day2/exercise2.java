package day2;
import java.util.*;
public class exercise2 {

	public static void main(String[] args) {
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


