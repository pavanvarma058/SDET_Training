package day2;
import java.util.*;
public class maximuOfThreeNum {

	public static void main(String[] args) {
		// Q. java program to find maximum number between three numbers using ladder or nested if else
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter Third number: ");
		int num3 = sc.nextInt();
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + " is maximum number");
			}else {
				System.out.println(num3 + " is maximum number");
			}
		}else if(num2 > num1) {
			if(num2 > num3) {
				System.out.println(num2 + " is maximum number");
			}else {
				System.out.println(num3 + " is maximum number");
			}
		}

	}

}
