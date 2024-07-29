package day3;
import java.util.*;

public class factorialNum {
	
	static int factorial(int num) {
		int i = 1;
		while(num > 0) {
			i = i * num;
			num--;
		}
		return i;
	}

	public static void main(String[] args) {
		// java program to find factorial number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int ans = factorial(num);
		System.out.println("Factorial of " + num + " is " + ans);

	}

}
