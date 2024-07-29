package day3;
import java.util.*;

public class StrongNumber {
	
	static int factorial(int num) {
		int i = 1;
		while(num > 0) {
			i = i * num;
			num--;
		}
		return i;
	}
	
	static int isStrongNumber(int num) {
		int sum = 0;
		while(num > 0) {
			int lastDigit = num % 10;
			int fact = factorial(lastDigit);
			sum += fact;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// Q. java program to find given number is a strong number or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int original = num;
		int strongNum = isStrongNumber(num);
		if(strongNum == original) {
			System.out.println(num + " is a Strong Number");
		}else {
			System.out.println(num + " is not a Strong Number");
		}

	}

}
