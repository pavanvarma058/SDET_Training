package day1;
import java.util.*;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Q. Java Program to find Fahrenheit to celsius
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fahrenheit: ");
		int f = sc.nextInt();
		float C = ((f - 32) / 9) * 5;
		System.out.println(C);

	}

}
