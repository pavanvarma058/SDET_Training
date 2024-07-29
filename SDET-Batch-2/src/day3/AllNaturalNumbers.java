package day3;
import java.util.*;
public class AllNaturalNumbers {

	public static void main(String[] args) {
		// Q. java program to print all natural numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
		}

	}

}
