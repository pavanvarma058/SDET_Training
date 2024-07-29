package day3;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// Q. Java program to find reverse of an array
		int[] arr = {24, 39, 35, 1, 2};
//		int[] revArr;
		int size = arr.length;
		for(int i=size-1; i>=0; i--) {
			System.out.println(arr[i] + " ");
		}

	}

}
