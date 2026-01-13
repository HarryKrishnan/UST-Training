package java_pack_sec_6;

import java.util.Scanner;

public class MaxOFNumbers {

	static void maxCheck(int first, int second) {

		if (first > second) {

			System.out.println("First num is greatest");
		} else {
			System.out.println("Second is greatest");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numOne;
		int numTwo;

		System.out.println("Enter the first number : ");
		numOne = scan.nextInt();

		System.out.println("Enter the second number : ");
		numTwo = scan.nextInt();

		maxCheck(numOne, numTwo);

	}

}
