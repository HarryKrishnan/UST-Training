package java_pack_sec_3;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int mod;

		System.out.println("Enter the Number : ");
		num = scan.nextInt();

		int original = num;

		int rev = 0;

		while (num > 0) {

			mod = num % 10;
			rev = rev * 10 + mod;
			num = num / 10;
		}
		if (rev == original) {

			System.out.println("Pallindrome");
			
		} else {

			System.out.println("Not pallindrome");
		}

	}

}
