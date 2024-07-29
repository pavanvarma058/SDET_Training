package day2;
import java.util.*;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// java program to convert fahrenheit to celsius
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fahrenheit: ");
		int f = sc.nextInt();
		float C = ((f - 32) / 9) * 5;
		System.out.println(C);

	}

}
