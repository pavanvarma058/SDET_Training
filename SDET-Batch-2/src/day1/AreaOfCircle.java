package day1;
import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Q. Java progrma to area of circle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = sc.nextInt();
		float area = (float) (3.14 * radius * radius);
		System.out.println("The Area of Circle: " + area);
	}

}
