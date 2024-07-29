package day1;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// Q. Java program to find Simple Interest
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		int principle = sc.nextInt();
		System.out.print("Enter rate: ");
		int rate = sc.nextInt();
		System.out.print("Enter Time: ");
		int time = sc.nextInt();
		
		float simpleInterest = (principle * rate * time) / 100;
		System.out.println("Simple Interest: " + simpleInterest);
	}

}
