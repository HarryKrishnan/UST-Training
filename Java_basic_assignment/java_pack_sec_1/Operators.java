package java_pack_sec_1;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numOne;
		int numTwo;
		int choice;

		System.out.println("Enter first number :");
		numOne = scan.nextInt();

		System.out.println("Enter the second number : ");
		numTwo = scan.nextInt();

		System.out.println("Enter the choice : ");
		System.out.println("1. Sum");
		System.out.println("2. Difference");
		System.out.println("3. Product");
		System.out.println("4. Quotient");

		choice = scan.nextInt();

		switch (choice) {

		case 1:
			System.out.println(numOne + numTwo);
			break;
		case 2:
			System.out.println(numOne - numTwo);
			break;
		case 3:
			System.out.println(numOne * numTwo);
			break;
		case 4:
			System.out.println(numOne % numTwo);
			break;
		default:
			System.out.println("Not in Option");
		}

	}

}
