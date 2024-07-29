package day3;
import java.util.*;

public class CountDigits {

	public static void main(String[] args) {
		// Q. java program to write all Count Digits of a number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n != 0) {
			count++;
			n = n/10;
		}
		System.out.println("count: " + count);
				

	}

}
