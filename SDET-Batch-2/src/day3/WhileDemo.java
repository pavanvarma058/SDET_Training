package day3;
import java.util.*;

public class WhileDemo {

	public static void main(String[] args) {
		// Q. while demo
		Scanner sc = new Scanner(System.in);
		int totalcost = 0;
		char wantedToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		while(wantedToAddFoodItem == 'Y') {
			totalcost = totalcost + (quantity * unitPrice);
			System.out.println("Order Placed Successfully");
			System.out.println("Total Cost: " + totalcost);
			System.out.println("Do you want to add more food items to your orders? Y or N");
			String input = sc.next();
			wantedToAddFoodItem = input.charAt(0);
			
		}

	}

}
