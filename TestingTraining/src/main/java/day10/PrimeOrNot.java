package day10;

public class PrimeOrNot {
	
	public boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num % 1 == 0) {
				return false;
			}
		}
		return true;
	}

}
