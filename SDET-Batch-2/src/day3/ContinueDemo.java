package day3;
import java.util.*;

public class ContinueDemo {

	public static void main(String[] args) {
		// Q. Continue Demo
		Scanner sc = new Scanner(System.in);
		int totalcost = 0;
		int unitprice = 10;
		System.out.print("Enter the number of food items to be ordered: ");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for(int counter=1; counter <= noFoodItemsToBeOrdered; counter++) {
			if(counter == 3) {
				continue;
				}
			System.out.print("Enter the food item: ");
			String foodItem = sc.next();
			System.out.print("Enter the Quantity: ");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			System.out.println("Order placed successfully placed the order " + counter);
			totalcost += unitprice * quantity;
			System.out.println("Total cost of the order: " + totalcost);
		}

	}

}
