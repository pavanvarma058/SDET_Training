package day2;
import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Q. java program to calculate area of circle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int r = sc.nextInt();
		float pi = 3.14f;
		float Area = (float) (pi * r * r);
		System.out.println(Area);
		

	}

}
