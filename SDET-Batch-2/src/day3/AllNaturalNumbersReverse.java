package day3;
import java.util.*;

public abstract class AllNaturalNumbersReverse {

	public static void main(String[] args) {
		// Q. java program to print all natural numbers in reverse
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) {
			System.out.print(i + " ");
		}

	}

}
