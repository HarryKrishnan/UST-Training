package java_pack_sec_6;

import java.util.Scanner;

public class FactorialMethod {

	static int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Factorial: " + factorial(num));

	}

}
