package day10;

public class ArmStrongOrNot {
	public int findLength(int num) {
		int len=0;
		while(num!=0) {
			len++;
			num/=10;
		}
		return len;
	}
	public boolean isArmStrong(int num) { // 153=1+125+27= 153
		int len = findLength(num);
		int originalNum = num;
		int temp = 0;
		while(num!=0) {
			int rem = num % 10;
			temp = temp + (int) Math.pow(rem, len);
			num/=10;
		}
		
		return originalNum==temp;
	}
	
	public static void main (String[] args) {
		System.out.println(new ArmStrongOrNot().findLength(12422345));
	}
}
