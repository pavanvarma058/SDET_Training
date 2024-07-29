package day2;
import java.util.*;

public class SidesOfTriangle {
	
	static String form_triangle(int a, int b, int c) {
		String success =  "Triangle can be formed";
		String failure = "Triangle can't be formed";
		
		if(a + b > c && a + c > b && b + c > a) {
			return success;
		}else {
			return failure;
		}
	}

	public static void main(String[] args) {
		// Q. Java program to find sides of Traingle
		int num1 = 3;
		int num2 = 3;
		int num3 = 5;
		String ans = form_triangle(num1, num2, num3);
		System.out.println(ans);
	}

}
