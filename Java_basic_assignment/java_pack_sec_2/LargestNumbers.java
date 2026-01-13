package java_pack_sec_2;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numOne;
		int numTwo;
		int numThree;
		
		System.out.println("enter the first num : ");
		numOne = scan.nextInt();
		
		System.out.println("enter the second num : ");
		numTwo = scan.nextInt();
		
		System.out.println("enter the third num : ");
		numThree = scan.nextInt();
		
		if (numOne > numTwo) {
			
			System.out.println(numOne+" is greatest");
		}
		else if (numTwo > numThree) {
			
			System.out.println(numTwo +" is greatest");
		}
		else {
			
			System.out.println(numThree + " is greatest");
		}

	}

}
