package day2;
import java.util.*;
public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int div = temp % 10;
            sum += div;
            temp /= 10;
        }
        if(num % sum == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

	}

}
