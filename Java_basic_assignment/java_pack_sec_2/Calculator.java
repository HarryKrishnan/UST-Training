package java_pack_sec_2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numOne;
		int numTwo;
		int choice;

		System.out.println("enter the first number : ");
		numOne = scan.nextInt();

		System.out.println("enter the second number : ");
		numTwo = scan.nextInt();

		System.out.println(" \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n ");

		System.out.println("enter the choice : ");
		choice = scan.nextInt();

		switch (choice) {

		case 1:
			System.out.println("The result is : "+ (numOne + numTwo));
			break;
		case 2:
			System.out.println("The result is : "+ (numOne - numTwo));
			break;
		case 3:
			System.out.println("The result is : "+(numOne * numTwo));
			break;
		case 4:
			System.out.println("The result is : "+(numOne / numTwo));
			break;

		}

	}

}
