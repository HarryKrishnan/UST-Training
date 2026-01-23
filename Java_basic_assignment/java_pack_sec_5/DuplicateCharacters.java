package java_pack_sec_5;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		System.out.println("Duplicate characters are:");

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j] && ch[i] != ' ') {
					System.out.println(ch[i]);
					break; 
				}
			}
		}

	}

}
