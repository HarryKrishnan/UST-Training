package java_pack_sec_6;

import java.util.Scanner;

public class MethodPrimeCheck {

	static void checkPrime(int num) {

		int count = 0;

		if (num <= 1) {
			System.out.println(num + " is NOT Prime");
			return;
		}

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is NOT Prime");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		checkPrime(n);
	}
}
