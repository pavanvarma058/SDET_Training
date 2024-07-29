package day3;
import java.util.*;

public class PalindromOrNot {

	public static boolean isPalindrome(int n) {
		int originalNumber = n;
		int reverseNum = 0;
		while(n != 0) {
			int digit = n % 10;
			reverseNum = reverseNum * 10 + digit;
			n /= 10;
		}
		return originalNumber == reverseNum;
	}
	
	public static void main(String[] args) {
		// Q. Java program to find a number is palindrome or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a palindrome: ");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));

	}

}
