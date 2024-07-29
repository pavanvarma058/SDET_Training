package day3;
import java.util.*;

public class SumOfAllNaturalNumbers {

	public static void main(String[] args) {
		// Q. java program to print sum of all natural numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("Sum of all Natural numbers: " + sum);


	}

}
