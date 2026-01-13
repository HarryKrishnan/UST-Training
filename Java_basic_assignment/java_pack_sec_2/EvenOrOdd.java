package java_pack_sec_2;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Enter the number : ");
		num = scan.nextInt();

		if (num % 2 == 0) {

			System.out.println("even");
		} else {

			System.out.println("odd");
		}

	}

}
