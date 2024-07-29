package day2;
import java.util.*;

public class positiveNegative {

	public static void main(String[] args) {
		// Q. java program to find a number is positive, negative using if else
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println(num  + " is positive");
		}else {
			System.out.println(num + " is negative");
		}
		
	}

}
