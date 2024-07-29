package day3;
import java.util.*;

public class SumAllUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int choice;
		do {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			sum += num;
			System.out.print("Do you want to continue 1/0: ");
			choice = sc.nextInt();
		}
		while(choice == 1); {
			System.out.println("Sum = " + sum);
		}

	}

}
