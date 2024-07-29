package day3;
import java.util.*;

public class DivisibleBySumOfDigits {

	static int SumofDigits(int num){
		int sum = 0;
		while(num>0) {
			int d = num % 10;
			sum += d;
			num = num/10;
		}
		return sum;
	}
	
	static boolean isDivisibleBySumOfDigits(int num) {
		int sum = SumofDigits(num);
		return (num % sum == 0);
	}
	
	public static void main(String[] args) {
		// Q. Java Program to find the given number is divisible by sum of its digits
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int n = sc.nextInt();
		if(isDivisibleBySumOfDigits(n)) {
			System.out.println("The number " + n + " is Divisible by Sum of its Digits");
		}else {
			System.out.println("The number " + n + " is not Divisible by Sum of its Digits");
			
		}

	}

}
