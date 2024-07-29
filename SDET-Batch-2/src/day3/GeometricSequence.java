package day3;
import java.util.*;

public class GeometricSequence {

	public static void displayGeometricSequence(int n) {
		int value = 1;
		for(int i=0; i < n; i++) {
			System.out.println(value + " ");
			value *= 2;
		}
	}
	
	public static void main(String[] args) {
		// Q. java program to find  to display the geometric sequence
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the geometric sequence: ");
		int n = sc.nextInt();
		
		displayGeometricSequence(n);

	}

}
