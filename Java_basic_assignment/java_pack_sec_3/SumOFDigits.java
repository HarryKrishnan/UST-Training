package java_pack_sec_3;

import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}

		System.out.println("Sum of digits = " + sum);
	}

}
