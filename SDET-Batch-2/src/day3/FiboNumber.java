package day3;
import java.util.*;

public class FiboNumber {
	
	public static void main(String[] args) {
		// Q. java program to find fibonacci series
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while(count <= num) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}
		System.out.println(b);
		

	}

}
