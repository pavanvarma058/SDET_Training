package day2;
import java.util.*;

public class evenOdd {

	public static void main(String[] args) {
		// Q. java program to find a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println( num + " is a even number");
		}else {
			System.out.println(num + " is a odd number");
		}

	}

}
