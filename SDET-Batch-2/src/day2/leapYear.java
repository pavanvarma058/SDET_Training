package day2;
import java.util.*;
public class leapYear {

	public static void main(String[] args) {
		// Q. java program to find a given year is leap year or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");;
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}

}
