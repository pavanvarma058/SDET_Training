package day3;
import java.util.*;

public class Demo {
	/*
	return_type methodName() {
		stmt1;
		stmt2;
	}*/
	
	static void m1() {
		System.out.println("M1-method");
	}
	
	static int m2() {
		return 100;
	}
	
	static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		m1();
		int num = m2();
		System.out.println(num);
		int a1 = 25;
		int a2 = 25;
		int sum = add(a1, a2);
		System.out.println(sum);

	}

}
