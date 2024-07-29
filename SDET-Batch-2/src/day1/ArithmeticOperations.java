package day1;
import java.util.*;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// Q. Java program to find Arithmetic operations
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number2: ");
		int b = sc.nextInt();
		int add = a + b;
		System.out.println("Sum = " + add);
		int sub = a - b;
		System.out.println("Difference = " + sub);
		int product = a * b;
		System.out.println("Product = " + product);
		int div = a / b;
		System.out.println("Quotient = " + div);
		int mod = a % b;
		System.out.println("Modulus = " + mod);

	}

}
