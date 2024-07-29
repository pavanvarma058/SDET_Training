package day3;
import java.util.*;

public class ArrayMax {

	public static void main(String[] args) {
		// Q. java program to find Max value in an Array
//		int[] arr = new int[5];
		int[] arr = {24, 39, 35, 1, 2};
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
		
	}

}
