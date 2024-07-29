package day1;
import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		// Q. Java program to find area of rectangle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int length = sc.nextInt();		
		System.out.print("Enter the Width: ");
		int width = sc.nextInt();
		int area = length * width;
		System.out.println("The Area of Rectangle: " + area + " sq. units");
		

	}

}
