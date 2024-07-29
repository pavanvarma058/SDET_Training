package day2;
import java.util.*;

public class CalElectricityBill {

	public static void main(String[] args) {
		// Q. java program to calculate electricity bill
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units: ");
		int units = sc.nextInt();
		
		double amount = 0.0;
		if(units <= 50) {
			amount = units * 0.50;
		}else if(units <= 150) {
			amount = 25 + (units - 50) * 0.75;
		}else if(units <= 250) {
			amount = 25 + 75 + (units - 150) * 1.20;
		}else {
			amount = 25 + 75 + 120 + (units - 250) * 1.50;
		}
		
		int surcharge = (int) (amount * 0.20);
		
		int netamount = (int) (amount + surcharge);
		System.out.println(netamount);

	}

}
