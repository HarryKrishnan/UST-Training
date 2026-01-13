package java_pack_sec_5;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        if (str.equals(rev)) {
	            System.out.println("The string is a Palindrome");
	        } else {
	            System.out.println("The string is NOT a Palindrome");
	        }

	}

}
