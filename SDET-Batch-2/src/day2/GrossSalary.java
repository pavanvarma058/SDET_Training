package day2;
import java.util.*;
public class GrossSalary {

	public static void main(String[] args) {
		// Q. java program to calculate gross salary of an employee
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		int basic_salary = sc.nextInt();
		int hra = 0;
		int da = 0;
		int gross_salary = 0;
		if(basic_salary <= 10000) {
			hra = (int) (basic_salary * 0.8);
			da = (int) (basic_salary * 0.2);
			gross_salary = basic_salary + hra + da;
		}else if(basic_salary >= 10001 && basic_salary <= 20000) {
			hra = (int) (basic_salary * 0.9);
			da = (int) (basic_salary * 0.2);
			gross_salary = basic_salary + hra + da;
		}else if(basic_salary >= 20001) {
			hra = (int) (basic_salary * 0.3);
			da = (int) (basic_salary * 0.95);
			gross_salary = basic_salary + hra + da;
		}
		System.out.println(gross_salary);

	}

}
