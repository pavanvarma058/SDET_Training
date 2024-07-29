package day3;
import java.util.*;
public class PowerOfNumber {
	
	static int poweNumber(int base, int expo) {
		int power = 1;
		for(int i=1; i<=expo; i++) {
			power *= base;
		}
		return power;
	}
	
	public static void main(String[] args) {
		// Q. java program to find power of a number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter baser: ");
		int base = sc.nextInt();
		System.out.print("Enter exponent: ");
		int expo = sc.nextInt();
		int ans = poweNumber(base, expo);
		System.out.println("Power: " + ans);

	}

}
