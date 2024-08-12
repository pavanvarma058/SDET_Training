package day10;

public class AutomorphicNumber {

	// 25 is automorphic as its number ends with 25
	public int findLength(int num) {
		int len = 0;
		while(num!=0) {
			len++;
			num/=10;
		}
		return len;
	}
	
	public int revNum(int num) {
		int rev=0;
		while(num!=0) {
			int rem = num%10;
			rev = (rev*10) + num;
			num /= 10;
		}
		return rev;
	}
	
	
	public boolean isAutomorphic(int num) {
		int square = num*num;
		int len = findLength(num);//2
		int n=0;
		while(num!=0) {
			int rem = square%10;//5
			n = (n*10)+rem;
			square/=10;
			len--;
		}
		return revNum(n)==num;
		
	}
}
