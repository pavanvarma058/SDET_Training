package day2;
import java.util.*;

public class divisibleBy5Or11 {
	public static void main(String[] args) {
		// Q. java program to find whether given number is divisible by 5 and 11
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println( num + " is divisibe by 5 and 11");
		}else {
			System.out.println( num + " is not divisble by 5 and 11");
		}
	}

}
