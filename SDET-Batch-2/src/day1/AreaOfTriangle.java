package day1;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// Q. Java program to find area of triangle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base: ");
		int b = sc.nextInt();
		System.out.print("Enter the Height: ");
		int h = sc.nextInt();
		int area = (int) (0.5 * b * h);
		System.out.println("The Area of Triangle: " + area + " sq. units");
	}

}
