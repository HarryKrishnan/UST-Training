package java_pack_sec_5;

import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str;

		System.out.println("Enter the string : ");
		str = scan.nextLine();

		System.out.println("String to upper case : " + str.toUpperCase());
		System.out.println("String to lower case : " + str.toLowerCase());

	}

}
