package day10;

public class PalindromOrNot {
	
	public boolean isPalindrome(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		return rev == str;
	}

}
