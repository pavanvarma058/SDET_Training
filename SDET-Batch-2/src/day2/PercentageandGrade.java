package day2;
import java.util.*;

public class PercentageandGrade {

	public static void main(String[] args) {
		// Q. java program to calculate percentage and grade
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks in physics: ");
		int phy = sc.nextInt();
		System.out.print("Enter marks in chemistry: ");
		int chem = sc.nextInt();
		System.out.print("Enter marks in biology: ");
		int bio = sc.nextInt();
		System.out.print("Enter marks in maths: ");
		int math = sc.nextInt();
		System.out.print("Enter marks in computer: ");
		int comp = sc.nextInt();
		float per = (float) ((phy + chem + bio + math + comp) / 5.0);
		
		if(per >= 90) {
			System.out.println("Grade A");
		}else if(per >= 80) {
			System.out.println("Grade B");
		}else if(per >= 70) {
			System.out.println("Grade C");
		}else if(per >= 60) {
			System.out.println("Grade D");
		}else if(per >= 40) {
			System.out.println("Grade E");
		}else {
			System.out.println("Grade F");
		}

	}

}
