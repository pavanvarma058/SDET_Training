package day2;
import java.util.*;

public class ValidTriangle {

	public static void main(String[] args) {
		// java program to check whether triangle is valid or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter angle1: ");
		int angle1 = sc.nextInt();
		System.out.print("Enter angle2: ");
		int angle2 = sc.nextInt();
		System.out.print("Enter angle3: ");
		int angle3 = sc.nextInt();
		int sum = angle1 + angle2 + angle3;
		if(angle1 > 0 && angle2 > 0 && angle3 > 0) {
			if(sum == 180) {
				System.out.println("Valid Triangle");
			}else {
				System.out.println("Invalid Triangle");
			}
		}else {
			System.out.println("Invalid Triangle");
		}

	}

}
