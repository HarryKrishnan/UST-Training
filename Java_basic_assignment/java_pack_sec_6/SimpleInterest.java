package java_pack_sec_6;

import java.util.Scanner;

public class SimpleInterest {

	static double interestCheck(double p, double i, double t) {

		return (p * i * t) / 100;
		
		

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double principal;
		double interest;
		double time;

		System.out.println("enter the principal value : ");
		principal = scan.nextDouble();

		System.out.println("enter the rate of interest value : ");
		interest = scan.nextDouble();

		System.out.println("enter the time : ");
		time = scan.nextDouble();

		System.out.println("Result : "+ interestCheck(principal, interest, time));

	}

}
