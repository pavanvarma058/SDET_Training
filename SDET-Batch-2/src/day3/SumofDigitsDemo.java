package day3;
import java.util.*;
public class SumofDigitsDemo {
	
	static int SumofDigits(int num){
		int sum = 0;
		while(num>0) {
			int d = num % 10;
			sum += d;
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// Q. java program to find sum of all digits
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = SumofDigits(num);
		System.out.println("Sum of Digits: " + sum);

	}

}
