package day2;
import java.util.*;

public class QuadraticEquation {

	public static void solveQuadraticEquation(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		
		if(discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The roots are real and different.");
			System.out.println("Root1: " + root1);
			System.out.println("Root2: " + root2);
		} else if(discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("The roots are real and same.");
			System.out.println("Root: " + root);
		} else {
			System.out.println("The Equation has no real roots.");
		}
	}

	public static void main(String[] args) {
		// Q. Java program to find Quadratic equation
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Coefficient a: ");
		double a = sc.nextDouble();
		System.out.print("Enter Coefficient b: ");
		double b = sc.nextDouble();
		System.out.print("Enter Coefficient c: ");
		double c = sc.nextDouble();
	
		solveQuadraticEquation(a, b, c);
	}

}
