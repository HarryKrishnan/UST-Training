package java_pack_sec_1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double principal;
		double rate;
		double time;
		double simpleInterest;

		System.out.print("Enter Principal Amount: ");
	    principal = scan.nextDouble();

		System.out.print("Enter Rate of Interest: ");
		rate = scan.nextDouble();

		System.out.print("Enter Time (in years): ");
		time = scan.nextDouble();

		simpleInterest = (principal * rate * time) / 100;
		
		System.out.println("Interest is : "+simpleInterest);

	}

}
