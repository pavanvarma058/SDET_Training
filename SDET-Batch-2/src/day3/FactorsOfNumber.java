package day3;
import java.util.*;

public class FactorsOfNumber {

		
	public static void main(String[] args) {
		// Q. java program to find factors of a number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
