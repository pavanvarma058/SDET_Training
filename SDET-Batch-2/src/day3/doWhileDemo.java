package day3;
import java.util.*;

public class doWhileDemo {

	public static void main(String[] args) {
		// Q. do while demo
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		char wantToAddFoodItem = 'N';
		int unitPrice = 10;
		int quantity = 1;
		
		do {
			totalCost = totalCost + (quantity * unitPrice);
			System.out.println("Order Placed Successfully");
			System.out.println("Total Cost: " + totalCost);
			System.out.println("Do you want to add more food items to your orders? Y or N");
			String input = sc.next();
			wantToAddFoodItem = input.charAt(0);
			
		} while(wantToAddFoodItem == 'Y'); {
			System.out.println("Thank you for ordering the food! it will reach you shortly...");
		}

	}

}
