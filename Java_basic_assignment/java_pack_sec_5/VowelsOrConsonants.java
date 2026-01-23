package java_pack_sec_5;

import java.util.Scanner;

public class VowelsOrConsonants {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str;

		System.out.println("Enter the String : ");
		str = scan.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

}
