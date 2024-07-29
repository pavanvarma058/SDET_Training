package day3;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// Q. java program to write all Count Digits of a number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int reverse = 0;
		while(n > 0) {
			int rem = n % 10;
			n /= 10;
			reverse = reverse * 10 + rem;
		}
		System.out.println("Reverse number: " + reverse);

	}

}
