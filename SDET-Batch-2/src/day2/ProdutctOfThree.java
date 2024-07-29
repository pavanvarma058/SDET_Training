package day2;
import java.util.*;

public class ProdutctOfThree {
	static int find_product(int num1, int num2, int num3) {
		int ans = 0;
		if( num1 != 7 && num2 != 7 && num3 != 7) {
			ans = num1 * num2 * num3;
//			System.out.println(ans);
		}else if(num1 != 7 && num2 == 7 && num3 != 7) {
			ans = num3;
//			System.out.println(ans);
		}else if(num1 == 7 && num2 != 7 && num3 != 7) {
			ans = num2 * num3;
//			System.out.println(ans);
		}else if(num1 != 7 && num2 != 7 && num3 == 7) {
			ans = -1;
//			System.out.println(ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		// Q. Java program to find product of three positive integers based on the rule
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter Number3: ");
		int num3 = sc.nextInt();
		int product = find_product(num1, num2, num3);
		System.out.println(product);
		

	}

}
