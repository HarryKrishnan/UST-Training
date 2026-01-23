package java_pack_sec_6;

import java.util.Scanner;

public class MethodEvenOrOdd {

	public static void evenOrOddCheck(int num) {

		if (num % 2 == 0) {

			System.out.println("Even number");
		} else {
			System.out.println("Odd num");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Enter the number : ");
		num = scan.nextInt();

		evenOrOddCheck(num);
	}

}
