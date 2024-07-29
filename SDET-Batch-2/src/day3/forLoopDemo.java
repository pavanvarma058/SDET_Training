package day3;
import java.util.*;
public class forLoopDemo {

	public static void main(String[] args) {
		// Q. for loop demo
		Scanner sc = new Scanner(System.in);
		int totalcost = 0;
		int unitprice = 10;
		System.out.println("Enter the number of food items to be ordered: ");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for(int counter=1; counter <= noFoodItemsToBeOrdered; counter++) {
			System.out.println("Enter the food item: ");
			String foodItem = sc.next();
			System.out.println("Enter the quantity: ");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			totalcost += unitprice * quantity;
			System.out.println("Order placed successfully");
			System.out.println("Total cost of the order: "+ totalcost);
			
		}

	}

}
