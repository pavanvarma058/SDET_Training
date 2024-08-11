package day10;

public class IndicesofNumber {

	public int[] findIndices(int[] arr, int numberToFind) {
		int[] output;
		// find the count of number
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == numberToFind) {
				count++;
			}
		}
		
		output = new int[count];
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==numberToFind) {
				output[temp]=i;
				temp++;
			}
		}
		
		return output;
	}
}
