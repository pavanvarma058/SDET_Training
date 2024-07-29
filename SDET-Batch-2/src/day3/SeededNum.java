package day3;
import java.util.*;

public class SeededNum {

	static boolean isSeed(int x, int y) {
		int product = x;
		int temp = x;
		
		while(temp > 0) {
			int digit = temp % 10;
			product *= digit;
			temp /= 10;
		}
		
		return product == y;
	}
	
	public static void main(String[] args) {
		// Q. Java program to find the given number is seeded or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		System.out.print("Enter a number: ");
		int y = sc.nextInt();
		
		if(isSeed(x, y)) {
			System.out.println("The number " + x + " is a seed of " + y + " .");
		}else {
			System.out.println("The number " + x + " is a seed of " + y + " .");			
		}

	}

}
