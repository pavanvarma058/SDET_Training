package day3;
import java.util.*;

public class LuckyNumber {

	public static boolean isLuckyNumber(int number) {
        String numberStr = String.valueOf(number);
        int sumOfSquares = 0;

        for (int i = 1; i < numberStr.length(); i += 2) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sumOfSquares += digit * digit;
        }

        return sumOfSquares % 9 == 0;
    }
	
	public static void main(String[] args) {
		// Q. Java program to find the given number is lucky number or not
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a lucky number: ");
        int number = scanner.nextInt();

        if (isLuckyNumber(number)) {
            System.out.println("The number " + number + " is a lucky number.");
        } else {
            System.out.println("The number " + number + " is not a lucky number.");
        }

	}

}
