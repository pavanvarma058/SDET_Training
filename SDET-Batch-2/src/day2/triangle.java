package day2;
import java.util.*;

public class triangle {

	public static void main(String[] args) {
		// java program to check whether a triangle is equilateral, scalene or isosceles 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side1: ");
		int side1 = sc.nextInt();
		System.out.print("Enter side2: ");
		int side2 = sc.nextInt();
		System.out.print("Enter side3: ");
		int side3 = sc.nextInt();
		
		if(side1 == side2 && side2 == side3) {
			System.out.println("The triangle is equilateral");
		}else if(side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("The traingle is isosceles");
		}else {
			System.out.println("The trianle is scalene");
		}

	}

}
