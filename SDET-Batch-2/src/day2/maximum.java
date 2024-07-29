package day2;
import java.util.*;
public class maximum {

	public static void main(String[] args) {
		// Q. java program to find maximum between two numbers using if else
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		// if else
		if(num1 > num2) {
			System.out.println(num1 + " is maximum number");
		}else {
			System.out.println(num2 + " is maximum number");
		}
		

	}

}
