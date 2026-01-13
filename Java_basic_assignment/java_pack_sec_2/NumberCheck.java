package java_pack_sec_2;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("enter the number : ");
		num = scan.nextInt();

		if (num > 0) {

			System.out.println("Its a possitive number");
		} else if (num < 0) {

			System.out.println("Its a negative number");
		} else {

			System.out.println("Zero");
		}

	}

}
