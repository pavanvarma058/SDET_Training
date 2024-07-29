package day3;
import java.util.*;
public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		// Q. java program to write sum of all Even Numbers
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number: ");
				int n = sc.nextInt();
				int sum = 0;
				for(int i=1; i<=n; i++) {
					if(i % 2 == 0) {
						sum += i;
					}
				}
				System.out.print("Sum of All Even Numbers:  " + sum);


	}

}
