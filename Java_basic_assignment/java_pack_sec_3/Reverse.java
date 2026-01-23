package java_pack_sec_3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int mod;
		int rev = 0;

		while (num > 0) {
			
			mod = num % 10;
			rev = rev * 10 + mod ;
			num = num / 10;
		}

		System.out.println("Reverse = " + rev);

	}

}
