package day3;
import java.util.*;

public class EvenOddArr {

	public static void main(String[] args) {
		// Q. Java program to input elements in array from user and count even and odd elements in array.
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int even = 0;
        int odd = 0;
        
        for(int j=0; j<array.length; j++) {
        	if(array[j] % 2 == 0) {
        		even++;
        	}else {
        		odd++;
        	}
        }
        System.out.println("No of Even elements in the array: " + even);
        System.out.println("No of Odd  elements in the array: " + odd);


	}

}
