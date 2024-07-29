package day3;
import java.util.*;

public class ArmStrongNumber {

	 public static boolean isArmstrong(int number) {
	       
	        String numberStr = String.valueOf(number);
	        int numDigits = numberStr.length();

	        int sum = 0;
	        int temp = number;

	       
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, numDigits);
	            temp /= 10;
	        }

	        return sum == number;
	 }
	public static void main(String[] args) {
		// Q. Java program to find the given number is armstrong number or not
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println("The number " + number + " is an Armstrong number.");
        } else {
            System.out.println("The number " + number + " is not an Armstrong number.");
        }

	}

}
