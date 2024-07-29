package day3;
import java.util.*;

public class BreakDemo {

	public static void main(String[] args) {
		// Q. Break Demo
		Scanner sc = new Scanner(System.in);
		int totalcost = 0;
		int unitprice = 10;
		System.out.print("Enter the max amount you can pay: ");
		int maxAmountCustomerCanPay = sc.nextInt();
		System.out.print("Enter the number of food items to be ordered: ");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for(int counter=1; counter <= noFoodItemsToBeOrdered; counter++) {
			System.out.print("Enter the food item: ");
			String foodItem = sc.next();
			System.out.println("Enter the Quantity: ");
			int quantity = sc.nextInt();
			totalcost += unitprice * quantity;
			if(totalcost > maxAmountCustomerCanPay) {
				System.out.println("Sorry! Total cost is crossing your max amount limit.");
				break;
			}
			System.out.println("You have ordered: " + foodItem);
			System.out.println("Order placed successfully");
			System.out.println("Total cost of the order: " + totalcost);
		}
	}

}
