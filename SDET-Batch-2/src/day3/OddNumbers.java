package day3;
import java.util.*;
public class OddNumbers {

	public static void main(String[] args) {
		// Q. java program to write all odd numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i % 2 != 0) {				
				System.out.print(i + " ");
			}
		}

	}

}
