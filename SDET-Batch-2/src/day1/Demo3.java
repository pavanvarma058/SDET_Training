package day1;

public class Demo3 {

	public static void main(String[] args) {
		// Arithmetic operators
		int num1 = 98;
		int num2 = 78;
		int num3 = 6;
		int num4 = 32;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.println(((num1 + num2) * num3) - num4);
		
		// Relational operators
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		// Logical operators
		System.out.println(num1 > num2 && num3 > num4);
		System.out.println(num1 == num2 || num3 >= num4);
		
		// Ternary operators
		int ans = (num1 > num3) ? (num1) : (num3);
		System.out.println(ans);
	}

}
