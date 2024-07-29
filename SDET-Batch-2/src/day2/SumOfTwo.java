package day2;
import java.util.*;

public class SumOfTwo {

	public static void main(String[] args) {
		// Q. java program to write if sum of two given numbers if the numbers are same
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int doubleSum = sum + sum;
		if(num1 == num2) {
			System.out.println(sum);
		}else {
			System.out.println(doubleSum);
		}

	}

}
